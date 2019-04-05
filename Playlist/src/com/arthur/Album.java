package com.arthur;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String songName, double duration){
        if(findSong(songName) == null){
            songs.add(new Song(songName,duration));
            return true;
        }
        return false;
    }
    public Song findSong(String songName){
        for(Song existingSong: songs){
            if(existingSong.getTitle().equals(songName)){
                return existingSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist){
        Song checkedSong = findSong(songName);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("no such song in the album");
        return false;
    }

}
