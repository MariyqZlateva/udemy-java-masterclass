package com.zlateva;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Player player = new Player();

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()

    public static void main(String[] args) {
        //    LinkedList<Album> albums = new LinkedList<>();
        Album album = new Album("City");
        album.addSong("Play with me", "8:51");
        album.addSong("Sing", "4:90");
        album.addSong("Don't cry", "4:90");
        album.addSong("Go go", "4:90");
        album.addSong("Fill the music", "4:90");
        album.addSong("Join the game", "4:90");
        album.addSong("Listen to me", "4:90");
        album.addSong("Fun", "4:90");
        album.addSong("Dance wiht me", "4:90");
        album.addSong("Be happy", "4:90");
        album.addSong("Go ahead", "4:90");

        Album album1 = new Album("Continent");
        album1.addSong("Tears For Fears", "5:25");
        album1.addSong("Laurel Hell", "5:25");
        album1.addSong("Sick!", "5:25");
        album1.addSong("Painless", "5:25");
        album1.addSong("Wild Loneliness", "5:25");
        album1.addSong("FTHC", "5:25");
        album1.addSong("Crash", "5:25");
        album1.addSong("The Tipping Point", "5:25");
        album1.addSong("Dragon New Warm Mountain I Believe In You", "5:25");
        album1.addSong("Humble Quest", "5:25");

        player.addAlbum(album);
        player.addAlbum(album1);

        player.addSongToPlayList("FTHC");
        player.addSongToPlayList("The Tipping Point");
        player.addSongToPlayList("Listen to me");
        player.addSongToPlayList("Sing");

        processPlaylist();

    }

    private static void processPlaylist() {
        ListIterator<Song> stringListIterator = player.getPlayList().listIterator();
        if (player.getPlayList().isEmpty()) {
            System.out.println("Playlist is empty!");
        } else {
            System.out.println("Now playing " + stringListIterator.next().getTitle());
        }
        String choiceMassage = "Choose 0 -> 5:";
        boolean quit = false;
        int choice = 0;
        menuOptions();
        boolean goingForward = true;
        while (!quit) {
            System.out.println(choiceMassage);
            choice = getInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (stringListIterator.hasNext()) {
                            stringListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (stringListIterator.hasNext()) {
                        System.out.println("Now playing " + stringListIterator.next().getTitle());
                    } else {
                        System.out.println("This is the LAST song!");
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (stringListIterator.hasPrevious()) {
                            stringListIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (stringListIterator.hasPrevious()) {
                        System.out.println("Now playing " + stringListIterator.previous().getTitle());
                    } else {
                        System.out.println("This is the FIRST song!");
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (stringListIterator.hasPrevious()) {
                            System.out.println("Now playing " + stringListIterator.previous().getTitle());
                            goingForward = false;
                        } else {
                            System.out.println("This is the FIRST song!");
                        }
                    } else {
                        if (stringListIterator.hasNext()) {
                            System.out.println("Now playing " + stringListIterator.next().getTitle());
                            goingForward = true;
                        } else {
                            System.out.println("This is the LAST song!");
                        }
                    }
                    break;
                case 4:
                    player.printPlayList();
                    break;
                case 5:
                    removeSong();
                    break;
            }
        }


    }

    private static void menuOptions() {
        System.out.println("Press: \n" +
                "\t0 -> to quit\n" +
                "\t1 -> to play next song\n" +
                "\t2 -> to play previous song\n" +
                "\t3 -> to replay current song\n" +
                "\t4 -> to view the playlist\n" +
                "\t5 -> to remove a song from the playlist");
    }

    private static void removeSong() {
        System.out.println("Remove song: ");
        String songTitle = scanner.nextLine();
        if (player.removeSongFromPlaylist(songTitle)) {
            System.out.println(songTitle + " was removed from playlist");
        } else {
            System.out.println(songTitle + " was not removed from playlist");
        }
    }

    private static int getInt() {
        while (true) {
            try {
                int number = scanner.nextInt();
                validateNumber(number);
                scanner.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private static void validateNumber(int number) {
        if ((number < 0) || (number > 5)) {
            throw new RuntimeException("Number should be between 0 and 5");
        }
    }

}
