package LINKEDLIST.com.mahmutcelik;

public class Node {
    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
        this.nextNode = null;
    }

    @Override
    public String toString(){
        return "DATA: " + this.data ;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
