package LINKEDLIST.com.mahmutcelik;


public class mainClass {

    public static void main(String[] args){





//
//        LinkedList linkedList = new LinkedList(1);
//        linkedList.addNode(2);
//        linkedList.addNode(3);
//        linkedList.addNode(4);
//        linkedList.addNode(5);
//        linkedList.printLinkedList();
//        linkedList.delete(6);
//        linkedList.delete(5);
//
//        linkedList.printLinkedList();
//        linkedList.delete(1);
//        linkedList.printLinkedList();
//        linkedList.delete(3);
//        linkedList.printLinkedList();
//        linkedList.delete(2);
//        linkedList.printLinkedList();
//        linkedList.delete(4);
//        linkedList.printLinkedList();
//        linkedList.delete(6);

        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.addWithAscendingOrder(1);
        myLinkedList.addWithAscendingOrder(3);
        myLinkedList.addWithAscendingOrder(4);
        myLinkedList.addWithAscendingOrder(2);
        myLinkedList.addWithAscendingOrder(2);
        myLinkedList.addWithAscendingOrder(6);
        myLinkedList.printLinkedList();
    }
}
