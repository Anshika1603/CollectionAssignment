package com.knoldus.Question8;

import java.util.ArrayList;
import java.util.List;

public class SubListFromList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        // Creating an ArrayList with 5 elements
        arraylist.add(23);
        arraylist.add(34);
        arraylist.add(92);
        arraylist.add(65);
        arraylist.add(34);

        System.out.println("Original arraylist: " + arraylist);

        // Getting the subList from ArrayList
        List<Integer> sublist = arraylist.subList(2, 4);

        System.out.println("Sublist of arraylist: " + sublist);
    }
}
