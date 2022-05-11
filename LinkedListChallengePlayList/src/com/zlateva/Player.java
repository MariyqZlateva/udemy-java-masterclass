package com.zlateva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player {
    private List<Album> albums;
    private List<Song> playList;

    public Player() {
        this.albums = new ArrayList<>();
        this.playList = new LinkedList<>();
    }

    public List<Song> getPlayList() {
        return playList;
    }

    private Album finedAlbum(String albumName) {
        for (Album album : albums) {
            if (album.getName().equals(albumName)) {
                return album;
            }
        }
        return null;
    }

    public boolean addAlbum(Album album) {
        if (finedAlbum(album.getName()) == null) {
            albums.add(album);
            return true;
        } else {
            return false;
        }
    }

    public boolean addSongToPlayList(String songTitle) {
        for (Album album : albums) {
            for (Song song : album.getSongs()) {
                if (song.getTitle().equals(songTitle)) {
                    if (!playlistHasSong(song)) {
                        playList.add(song);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean removeSongFromPlaylist(String songTitle) {
        Song song = playlistHasSong(songTitle);
        return this.playList.contains(song);
    }

    public void printPlayList() {
        int listNumber = 1;
        System.out.println("Your playlist: ");
        for (Song song : playList) {
            System.out.println(" \t " + listNumber + " " + song.getTitle());
            listNumber++;
        }
    }
    //==private methods==
    private boolean playlistHasSong(Song song) {
        return this.playList.contains(song);
    }

    private Song playlistHasSong(String songTitle) {
        Song song = null;
        for (Song s : playList) {
            if (s.getTitle().equals(songTitle)) {
                song = s;
            }
        }
        return song;
    }

}
