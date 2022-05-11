package com.zlateva;

public class Song {

    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
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

        Song song = (Song) o;

        return title.equals(song.title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + title + '\'' +
                '}';
    }
}
