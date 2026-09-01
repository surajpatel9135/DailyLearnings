package doublylinkedlist;

public class DoublyLinkedList {
    private Node head;


    public void insertFirst(int val) {
        Node node = new Node(val);
    
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        last = node;
    }

    public void insertAfter(int val, int after) {
        Node node = new Node(val);
        Node temp = find(after);

        if (temp == null) {
            System.out.println(after + " Not Found!");
            return;
        }

        node.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = node;
        }

        temp.next = node;
        node.prev = temp;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = head;
        System.out.println(temp.val+ " -> Removed");
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteLast() {
	    if(head == null) {
	        System.out.println("List is Empty!");
	        return;
	    }

        if (head.next == null) {
            head = null;
            return;
        }

	    Node temp = head;
        
	    while(temp.next != null) {
	        temp = temp.next;
	    }
        System.out.println(temp.val+" removed");
	    temp.prev.next = null;
	}

    public void deleteAfter(int after) {
        Node temp = find(after);

        if (temp == null) {
            System.out.println(after + " Not Found!");
            return;
        }

        if (temp.next == null) {
            System.out.println("No node exists after " + after);
            return;
        }

        Node deleteNode = temp.next;
        System.out.println(deleteNode.val+" removed After "+ temp.val);
        temp.next = deleteNode.next;

        if (deleteNode.next != null) {
            deleteNode.next.prev = temp;
        }
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

    public void display() {
        Node start = head;
        // Node last = null;

        while (start != null) {
            System.out.print(start.val + " -> ");

            // last = start;       
            start = start.next;  
        }

        System.out.println("END");

        // while (last != null) {
        //     System.out.print(last.val + " -> ");
        //     last = last.prev;
        // }

        // System.out.println("START");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;
        
        public Node (int val) {
            this.val = val;
        }

        // public Node (int val, Node prev, Node next) {
        //     this.val = val;
        //     this.prev = prev;
        //     this.next = next;
        // }
    }
}
