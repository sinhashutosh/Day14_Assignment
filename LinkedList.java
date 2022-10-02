package org.example;

public class LinkedList {
    public static void main(String[] args) {
        LinkedListOperation list = new LinkedListOperation();
        list.append(56);
        list.append(30);
        list.append(70);
        list.append(40);
        list.printList();
        System.out.println();
        //System.out.println("************************************");
        //list.insertAfter(list.head, 56, 30);
        // list.printList();
        System.out.println("\n************************************");
        //  list.deleteAtEnd();
        // list.searchInList(30);
        list.sortedList();
        list.printList();
    }
}