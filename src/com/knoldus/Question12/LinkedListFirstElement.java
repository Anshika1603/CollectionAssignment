package com.knoldus.Question12;

import java.util.LinkedList;

public class LinkedListFirstElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Using the get() method and passing 0 as index
        String firstElement1 = linkedList.get(0);
        System.out.println("First element using get(): " + firstElement1);

        // Using the peek() method
        String firstElement2 = linkedList.peek();
        System.out.println("First element using peek(): " + firstElement2);

        // Using the getFirst method
        String firstElement3 = linkedList.getFirst();
        System.out.println("First element using getFirst(): " + firstElement3);

        // Using the element method
        String firstElement4 = linkedList.element();
        System.out.println("First element using element(): " + firstElement4);
    }
}

