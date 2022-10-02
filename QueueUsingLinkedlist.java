package org.example;

public class QueueUsingLinkedlist {
    private Node front, rear;
    private int currentSize;

    private class Node {
        int data;
        Node next;
    }


    public QueueUsingLinkedlist() {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }
    public int dequeue()
    {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        currentSize--;
        System.out.println(data+ " removed from the queue");
        return data;
    }
    public void printQueue() {
        Node temp = front;
        System.out.println("Linked List :");

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}

