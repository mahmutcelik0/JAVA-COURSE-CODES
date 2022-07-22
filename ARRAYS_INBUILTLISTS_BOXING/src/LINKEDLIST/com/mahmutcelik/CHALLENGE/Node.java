package LINKEDLIST.com.mahmutcelik.CHALLENGE;

public class Node {
    private Song song;
    private Node nextNode;
    private Node previousNode;

    public Node(Song song, Node nextNode, Node previousNode) {
        this.song = song;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public Node(Song song){
        this(song,null,null);
    }

    @Override
    public String toString(){
        return song.toString();
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
}