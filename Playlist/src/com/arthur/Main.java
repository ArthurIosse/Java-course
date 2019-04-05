package com.arthur;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<Album>();

	    Album metallica = new Album("Metallica");

	    metallica.addSong("enter sandman", 5.32);
        metallica.addSong("sad but true", 5.25);
        metallica.addSong("the unforgiven", 6.27);
        metallica.addSong("nothing else matters", 6.29);
        metallica.addSong("wherever i may roam", 6.44);
        metallica.addSong("holier than you", 3.48);
        metallica.addSong("through the never", 4.04);
        albums.add(metallica);

        Album stanger = new Album("stAnger");

        stanger.addSong("franttic",5.5);
        stanger.addSong("dirty window",5.25);
        stanger.addSong("my world",5.46);
        stanger.addSong("shoot me again",7.1);
        stanger.addSong("purify",5.14);
        albums.add(stanger);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("enter sandman",playList);
        albums.get(0).addToPlayList("sad but true",playList);
        albums.get(0).addToPlayList("asdasdsda",playList);
        albums.get(1).addToPlayList("franttic",playList);
        albums.get(1).addToPlayList("my world",playList);
        albums.get(1).addToPlayList("purify",playList);

        play(playList);

    }

    public static void play(LinkedList<Song> playlist){

        if(playlist.size() == 0) {
            System.out.println("no songs in the playlist");
            return;
        }
        ListIterator<Song> iterator = playlist.listIterator();
        printMenu();
        System.out.println("playing "+ iterator.next().getTitle());
        Scanner scanner = new Scanner(System.in);



        boolean quit = false;

        while(!quit) {
            switch (scanner.nextInt()) {
                case 1:
                   // iterator.next();
                    System.out.println("playing "+ iterator.next().getTitle());
                    break;

                case 2:
                   // iterator.previous();
                    System.out.println("playing "+ iterator.previous().getTitle());
                    break;
                case 3:
                   songList(playlist);
                    break;
                case 4:
                    quit = true;
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("============\n1 next song\n2 prev song\n3 show songs\n4 exit\n5 print menu\n============");
    }

    public static void songList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        for(Song song : playlist){
            System.out.println(iterator.next().getTitle());
        }
    }
}
