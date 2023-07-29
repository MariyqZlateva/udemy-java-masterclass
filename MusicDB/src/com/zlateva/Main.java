package com.zlateva;

import com.zlateva.model.Artist;
import com.zlateva.model.Datasource;
import com.zlateva.model.SongArtist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }


        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_DESC);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("Id = " + artist.getId() + " Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_DESC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_DESC);
        if (songArtists == null) {
            System.out.println("Couldn't fined the artist for the song");
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }


        datasource.querySongsMetadata();
        datasource.close();
    }
}