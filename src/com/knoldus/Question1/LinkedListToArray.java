package com.knoldus.Question1;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        // Creating a LinkedList with 5 objects
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Converting it to an Array
        Integer[] array = new Integer[linkedList.size()];
        linkedList.toArray(array);

        // Iterating it through the Array using foreach loop
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}

