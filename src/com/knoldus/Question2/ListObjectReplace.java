package com.knoldus.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObjectReplace {
    public static void main(String[] args) {
        // Creating a List with 5 objects
        List<String> list = new ArrayList<>();
        list.add("Anshika");
        list.add("Jasleen");
        list.add("Riya");
        list.add("Sahil");
        list.add("Jitin");

        // Replacing all objects with one new object
        Collections.fill(list, "JAVA STUDIO");
        System.out.println(list);
    }
}

