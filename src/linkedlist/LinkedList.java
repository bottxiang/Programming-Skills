package linkedlist;

public class LinkedList {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static Node myReverse(Node head) {
        Node reversedHead = null;
        while(head != null) {
            Node t = reversedHead;
            reversedHead = head;
            head = head.next;
            reversedHead.next = t;
        }
        return  reversedHead;
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        for(int i = 1; i <= 5; i++) {
            if (i == 1) {
                Node first = new Node(i);
                head = first;
                tail = first;
            } else {
                Node oth = new Node(i);
                tail.next = oth;
                tail = tail.next;
            }
        }


        print(myReverse(reverse(head)));

    }

}
