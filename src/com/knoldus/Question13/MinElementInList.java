package com.knoldus.Question13;

import java.util.*;
public class MinElementInList {
    public static void main(String[] args) {
        //Creating
        List<Integer> list = new ArrayList<>();
        list.add(26);
        list.add(23);
        list.add(79);
        list.add(12);
        list.add(44);

        //Using min() method of Collections to get minimum element
        Integer minimumElement = Collections.min(list);
        System.out.println("Minimum element is: "+minimumElement);
    }
}
