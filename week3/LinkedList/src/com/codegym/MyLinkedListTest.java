package com.codegym;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("Testing");
        MyLinkedList link1 = new MyLinkedList(10);
        link1.addFirst(88);
        link1.add(1, 3);
        link1.add(2, 5);
        link1.addLast(77);
        link1.removeAtPosition(2);
        link1.printList();
//        System.out.println(link1.get(0));
        System.out.println(link1.indexOf(77));

        System.out.println(link1.size());
//        link1.add(5,6);
//        link1.printList();

    }
}
