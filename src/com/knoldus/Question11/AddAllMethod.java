package com.knoldus.Question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAllMethod {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");

        // Printing Original List
        System.out.println("Original list:"+list);

        //Adding elements using the addAll Method
        Collections.addAll(list, "Python","php");

        // Printing List after adding elements
        System.out.println("After adding elements:"+list);
    }
}
