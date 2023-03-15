package com.knoldus.Question9;

import java.util.*;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);

        System.out.println("Original LinkedList: " + linkedlist);

        // Shuffling the LinkedList
        Collections.shuffle(linkedlist);
        System.out.println("Shuffled LinkedList: " + linkedlist);
    }
}

