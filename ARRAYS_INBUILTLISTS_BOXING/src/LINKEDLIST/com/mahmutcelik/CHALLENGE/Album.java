package LINKEDLIST.com.mahmutcelik.CHALLENGE;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songList ;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songList = new ArrayList<>();
    }

    public void addSong(String songName , double duration){
        int numberExist = alreadyExist(songName);

        if(numberExist == -1){
            songList.add(new Song(songName,duration));
        }
        else System.out.println("THIS SONG "+songName+" IS ALREADY EXIST");
    }


    public void deleteSong(String songName){
        int numberExist = alreadyExist(songName);

        if(numberExist ==-1) System.out.println("THIS SONG "+songName+" IS NOT EXIST");
        else{
            songList.remove(numberExist);
            System.out.println(songName + " HAS BEEN DELETED SUCCESSFULLY FROM ALBUM");
        }
    }

    public int findIndexOfSong(String songName){
        return alreadyExist(songName);
    }

    private int alreadyExist(String songName){
        for(Song songfromList : songList){
            if(songfromList.getTitleOfSong().equals(songName)){
                return songList.indexOf(songfromList);
            }
        }
        return -1;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }


}
