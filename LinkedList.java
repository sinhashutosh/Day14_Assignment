package org.example;

public class LinkedList {
    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.display();
        System.out.println("\npeek element = " + obj.peek());
        obj.pop();
        obj.display();
        System.out.println("\npeek element = " + obj.peek());
        obj.pop();
        obj.display();
        System.out.println("\npeek element = " + obj.peek());
        obj.pop();
        System.out.println("\npeek element = " + obj.peek());
        obj.display();
    }
}