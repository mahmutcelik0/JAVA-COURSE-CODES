package LINKEDLIST.com.mahmutcelik;

public class LinkedList {
    private Node head;

    public LinkedList(int data){
        head = new Node(data);
    }

    public void addNode(int data){
        Node currentNode = head;
        while(currentNode.getNextNode() !=null){
            currentNode= currentNode.getNextNode();
        }
        currentNode.setNextNode(new Node(data));
    }

    public int findIndex(int data){
        Node currentNode = head;
        int index = 0;
        while(currentNode.getNextNode() !=null){
            if(currentNode.getData() == data) return index;
            currentNode = currentNode.getNextNode();
            index++;
        }
        return -1;
    }

    public void delete(int valueToDelete){
        Node current = head;
        Node previous = current;

        while(current !=null){
            if(valueToDelete == head.getData() && head.getNextNode() !=null){

                deleteFromHead();
                return;}
            else if(valueToDelete == current.getData() && current.getNextNode() !=null){

                previous.setNextNode(current.getNextNode());
                return;
            }
            else if(valueToDelete == current.getData() && current.getNextNode() == null && current != head){
                deleteFromEnd();
                return;
            }
            else if(valueToDelete == head.getData() && head.getNextNode() == null){
                head.setNextNode(null);
                head = null;
                return;
            }
            previous = current;
            current = current.getNextNode();
        }
        System.out.println(valueToDelete+" IS NOT A ELEMENT OF LINKED LIST");
    }

    private void deleteFromHead(){
        Node current = head;
        head = current.getNextNode();
    }

    private void deleteFromEnd(){
        Node current = head;
        Node previous = current;
        while(current.getNextNode() != null){
            previous = current;
            current = current.getNextNode();
        }
        previous.setNextNode(null);
    }

    public void printLinkedList(){
        Node current = head;
        if(current == null) System.out.println("THERE IS NO ELEMENT IN LINKEDLIST");
        else {
            System.out.println("-------------------------");
            while(current != null){
                System.out.println(current.toString());
                current = current.getNextNode();
            }
        }
    }

    public void addWithAscendingOrder(int valueToAdd){
        Node current = head;
        Node previous = current;

        Node newNode = new Node(valueToAdd);
        while(current != null){
            if(current.getData() == valueToAdd) return;

            else if(valueToAdd< head.getData()){
                newNode.setNextNode(head);
                head = newNode;
                return;
            }
            else if(valueToAdd < current.getData()){
                previous.setNextNode(newNode);
                newNode.setNextNode(current);
                return;
            }

            else if(valueToAdd> current.getData() && current.getNextNode() == null){
                current.setNextNode(newNode);
                return;
            }

            previous = current;
            current = current.getNextNode();


        }

    }

}
