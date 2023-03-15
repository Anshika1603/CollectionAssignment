package com.knoldus.Question5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListElementSwap {
    public static void main(String[] args) {
        // Creating an ArrayList with 5 elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add("Scala");

        // Printing the ArrayList before Swapping
        System.out.println("ArrayList before Swapping: " + list);

        // Swapping two elements og index 1 and 3 in the ArrayList
        Collections.swap(list, 1, 3);

        // Printing the ArrayList after Swapping
        System.out.println("ArrayList after Swapping: " + list);
    }
}
