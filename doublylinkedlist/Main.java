package doublylinkedlist;

public class Main {
    public static void main (String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(4);
        list.insertLast(22);
        list.insertAfter(15, 04);
        list.insertAfter(16, 12);
        list.display(); 
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAfter(8);
        list.display();
    }
}
