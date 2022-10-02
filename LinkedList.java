package org.example;

public class LinkedList {
    public static void main(String[] args) {
        QueueUsingLinkedlist q = new QueueUsingLinkedlist();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}