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

        List<Artist> artists = datasource.queryArtists(5);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtists();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a song title: ");
//        String title = scanner.nextLine();

//        //Go Your Own Way" ot 1=1 or" sql injection
//        songArtists = datasource.querySongInfoView(title);
//        if (songArtists.isEmpty()) {
//            System.out.println("Couldn't find the artist for the song");
//            return;
//        }
//
//        for (SongArtist artist : songArtists) {
//            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
//                    " Album name = " + artist.getAlbumName() +
//                    " Track number = " + artist.getTrack());
//        }

  //      datasource.insertSong("Touch of Grey", "Greatful Dead", "In The Dark",1 );
        datasource.insertSong("Happy Me", "Hello", "90-ties Greatest Hits",5 );

        datasource.close();
    }
}