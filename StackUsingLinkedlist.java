package org.example;

import static java.lang.System.exit;

public class StackUsingLinkedlist {
    Node top;
    private class Node {
        int data;
        Node link;
    }
    public StackUsingLinkedlist() {
        this.top = null;
    }
    public void push(int element) {
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\n Stack is full Heap Overflow");
            exit(0);
        }
        temp.data = element;
        temp.link = top;
        top = temp;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }

    }


}
