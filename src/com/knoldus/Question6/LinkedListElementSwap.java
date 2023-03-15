package com.knoldus.Question6;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListElementSwap {
    public static void main(String[] args) {
        // Creating a LinkedList with 5 integer elements
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(220);
        list.add(700);
        list.add(350);
        list.add(400);

        // Printing the LinkedList before Swapping
        System.out.println("LinkedList before Swapping: " + list);

        // Swapping elements in the LinkedList
        Collections.swap(list, 1, 3);

        // Printing the LinkedList after Swapping
        System.out.println("LinkedList after Swapping: " + list);
    }
}

