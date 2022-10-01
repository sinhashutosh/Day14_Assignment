package org.example;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperation list = new LinkedListOperation();
        list.append(56);
        list.append(70);
        list.printList();
        System.out.println();
        System.out.println("************************************");
        list.insertAfter(list.head,56,30);
        list.printList();
    }
}
