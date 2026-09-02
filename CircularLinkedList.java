import org.w3c.dom.Node;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;

        if (node == null) {
            System.out.println("List is empty!");
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        }
        Node node = head;
        do {
            System.out.print(node.val+" -> ");
            node = node.next;
        } while (node != head);
        System.out.println("HEAD");
    }

    private class Node {
        private int val;
        private Node next;

        public Node (int val) {
            this.val = val;
        }
        
    }
    public static void main (String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(8);
        list.insert(23);
        list.insert(15);
        list.insert(22);
        list.insert(11);
        list.insert(19);
        System.out.println("Before deletion: ");
        list.display();
        System.out.println("After deletion ");
        list.delete(22);
        list.display();
    }
}