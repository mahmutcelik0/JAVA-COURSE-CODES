package LINKEDLIST.com.mahmutcelik.CHALLENGE;

import java.util.Scanner;

public class PlayList {
    private String playlistName;
    private LinkedList playLinkedList ;

    public PlayList(String nameOfPlayList, Song firstSong){
        this.playlistName = nameOfPlayList;
        this.playLinkedList = new LinkedList(firstSong.getTitleOfSong(),firstSong.getDurationOfSong());

    }

    public void addSongtoPlaylist(Song song){
        playLinkedList.add(song);
    }

    public void deleteSongFromPlaylist(Song song){
        playLinkedList.delete(song);
    }

    public void traverseList(){
        Node current = playLinkedList.getHead();

        while(current !=null){
            System.out.println("-------------------------------\n" +
                    current.getSong().toString());
            current = current.getNextNode();
        }
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int numberFromUser =Integer.MIN_VALUE;
        Node currentNode = playLinkedList.getHead();


        do{
            System.out.println("-----OPTIONS THAT YOU CAN MAKE-----");
            options();

            System.out.print("ENTER WHAT DO YOU WANT TO DO:");
            numberFromUser = scanner.nextInt();
            scanner.nextLine();

            switch (numberFromUser){
                case 0:
                    System.exit(0);
                case 1:
                    if(currentNode.getNextNode() == null){
                        System.out.println("THIS SONG IS LAST SONG");
                    }else{
                        currentNode = currentNode.getNextNode();
                    }
                    break;
                case 2:
                    if(currentNode.getPreviousNode() == null){
                        System.out.println("THIS SONG IS FIRST SONG");
                    }else{
                        currentNode = currentNode.getPreviousNode();
                    }
                    break;
                case 3:
                    break;
            }

            System.out.println("\n-----------------------------"+
                    "\nCURRENTLY PLAYING MUSIC"

                    +currentNode.getSong().toString()+"\n-----------------------------\n"
            );


        }while(numberFromUser != 0);



    }

    private void options(){
        System.out.println(
                """
                        QUIT------------------------0
                        SKIP FORWARD MUSIC ---------1
                        SKIP BACKWARD MUSIC --------2
                        REPLAY CURRENT SONG --------3"""
        );
    }

    private void skipForward(){

    }
}
