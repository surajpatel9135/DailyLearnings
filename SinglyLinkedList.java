import java.util.LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList () {
        this.size = 0;
    }

    public void insertFirst (int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast (int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert (int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    
    public int deleteLast() {
        
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        
        int val = temp.next.val;
        temp.next = null;
        size--;
        return val;
    }
    
    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        
        if(index == size -1) {
            return deleteLast();
        }
        
        Node prev = get(index - 1);
        int val = prev.next.val;
        
        prev.next = prev.next.next;
        return val;
    }

    public Node find (int val) {
        Node node = head;
        while(node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public Node get(int index) {
        Node node = head;
        
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(12);
        list.insertLast(20);
        list.insertLast(8);
        list.insert(54, 3);
        list.insert(5, 2);
        list.display();
		System.out.println(list.deleteFirst()+" removed");
		list.display();
		System.out.println(list.deleteLast()+" removed");
		list.display();
		System.out.println(list.delete(1)+" removed");
		list.display();
        System.out.println(list.find(54));
    }

}
