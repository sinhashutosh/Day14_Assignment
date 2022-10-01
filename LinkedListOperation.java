package org.example;

public class LinkedListOperation {
    Node head;

    public class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;

        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Inserts a new node after the given prev_node.
    public void insertAfter(Node head, int prev_data, int new_Data) {
        Node temp = head;
        Node new_Node = new Node(new_Data);
        while (temp.data != prev_data && temp != null) {
            temp = temp.next;
        }
        if (temp.data == prev_data) {
            new_Node.next = temp.next;
            temp.next = new_Node;
        }
    }

    // Appends a new node at the end.
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(" -> " + tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
