package com.knoldus.Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObjectReverse {
    public static void main(String[] args) {
        // Creating an ArrayList with 5 objects
        List<String> list = new ArrayList<>();
        list.add("Delhi");
        list.add("Noida");
        list.add("Gurgaon");
        list.add("Faridabad");
        list.add("Ghaziabad");

        // Reversing the List
        Collections.reverse(list);
        System.out.println(list);
    }
}
