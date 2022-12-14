package org.example;

import static java.lang.System.exit;

public class LinkedListOperation {
    Node head;

    public void searchInList(int searchData) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        boolean ischeck = false;
        while (temp.next != null) {
            if (temp.data == searchData) {
                System.out.println(searchData + " is present in the list");
                ischeck = true;
            }
            temp = temp.next;
        }
        if (ischeck == false) {
            System.out.println(searchData + " is not in the list");
        }
    }

    public void sortedList() {
        if (head == null) {
            System.out.println("linked list are empty");
        }
        Node temp = head;
        Node index;
        while(temp !=null) {
            index = temp.next;
            while(index != null) {
                if (temp.data > index.data){
                    int temps = temp.data;
                    temp.data = index.data;
                    index.data = temps;
                }
                index = index.next;
            }
            temp = temp.next;
        }
    }

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

    //pop at begining of linked list
    public void deleteAtStart(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("link  list is empty");
        } else {
            head = temp.next;
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(" -> " + tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }

    // pop at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            exit(0);
        }
        if (head.next == null) {
            head = null;
            exit(0);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            temp.next = null;
        }

    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(" -> " + tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
