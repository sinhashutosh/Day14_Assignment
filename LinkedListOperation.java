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
    public void printList()
    {
        Node tempNode = head;
        while (tempNode != null)
        {
            System.out.print(" -> "+ tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
