package LINKEDLIST.com.mahmutcelik.CHALLENGE;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(String songName,double duration){
        this.head= new Node(new Song(songName, duration));
        this.tail = head;
    }

    public void add(Song song){
        tail.setNextNode(new Node(song));
        tail.getNextNode().setPreviousNode(tail);
        tail = tail.getNextNode();
    }

    public boolean delete(Song song){
        if(head == null) return false;
        else if(head == tail){
            head = null;
            tail = null;
            return true;
        }
        else if(song.getTitleOfSong().equals(head.getSong().getTitleOfSong()) && song.getDurationOfSong() == head.getSong().getDurationOfSong()){
            deleteFromHead();
            return true;
        }
        else if(song.getTitleOfSong().equals(tail.getSong().getTitleOfSong()) && song.getDurationOfSong() == tail.getSong().getDurationOfSong()){
            deleteFromTail();
            return true;
        }
        else{
            Node current = head;
            while(current != null){
                if(current.getSong().getTitleOfSong().equals(song.getTitleOfSong()) && current.getSong().getDurationOfSong() == song.getDurationOfSong()){
                    current.getPreviousNode().setNextNode(current.getNextNode());
                    current.getNextNode().setPreviousNode(current.getPreviousNode());
                    return true;
                }
                current = current.getNextNode();
            }
            return false;
        }
    }

    private void deleteFromHead(){
        head.getNextNode().setPreviousNode(null);
        head = head.getNextNode();
    }

    private void deleteFromTail(){
        tail.getPreviousNode().setNextNode(null);
        tail = tail.getPreviousNode();
    }

    public Node getHead() {
        return head;
    }



    public Node getTail() {
        return tail;
    }
}
