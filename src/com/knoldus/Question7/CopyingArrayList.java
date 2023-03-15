package com.knoldus.Question7;

import java.util.ArrayList;

public class CopyingArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList with 5 elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add("Scala");

        // Printing the Original ArrayList
        System.out.println("Original ArrayList " + list);

        // Creating a copy of the Original ArrayList
        ArrayList<String> copyOfArrayList=new ArrayList<>(list);

        // Printing the copy of ArrayList
        System.out.println("Copy Of ArrayList: " + copyOfArrayList);
    }
}
