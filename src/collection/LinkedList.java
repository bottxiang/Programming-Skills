package collection;

import org.junit.Test;


public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node (int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list,  int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            //创建空结点
            Node empty_node = new Node(0);
            //头结点指向空结点
            list.head = empty_node;
            //连上插入的第一个节点
            list.head.next = new_node;
        } else {
            Node tail = list.head.next;
            //找到尾结点
            while (tail.next != null) {
                tail = tail.next;
            }
            //连上新结点
            tail.next = new_node;
        }
        return list;
    }
    public static void deleteBYKey(LinkedList list,  int key) {
        if (list.head.next == null) {
            return;
        }
        Node prev = list.head;
        Node current = list.head.next;
        while (current != null && current.data != key) {
            current = current.next;
            prev = prev.next;
        }
        if (current == null) {
            return;
        } else {
            prev.next = current.next;
        }

    }
    public static void printLinkedList(LinkedList list) {
        Node currentNode = list.head.next;
        System.out.println("LinkedList:");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    @Test
    public void testLinkedList() {
        LinkedList list = new LinkedList();
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        deleteBYKey(list,2);
        deleteBYKey(list,4);
        deleteBYKey(list,1);

        printLinkedList(list);
    }
}
