package com.zlateva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album extends LinkedList<String> {
    private String name;
    private List<Song> songs;

    public Album(String name) {
        this(name, new ArrayList<>());
    }

    public Album(String name, ArrayList<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return new ArrayList<>(songs);
    }

    public String getName() {
        return name;
    }

    public boolean addSong(Song song) {
        if (!findSong(song)) {
            songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    public boolean addSong(String title, String duration) {
        Song checkedSong = findSong(title);
        if (checkedSong == null) {
            checkedSong = new Song(title, duration);
            songs.add(checkedSong);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = songs.hashCode();
        result = (31 * result) + 17;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Album album = (Album) o;

        return album.equals(album.name);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' + getSongs() +
                '}';
    }

    //== private methods ==
    private boolean isSongPresentInAlbum(String title) {
        for (Song current : songs) {
            if (current.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean findSong(Song song) {
        return songs.contains(song);
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

}
