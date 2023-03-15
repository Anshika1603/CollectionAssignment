package com.knoldus.Question4;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetRemove {
    public static void main(String[] args) {
        // Creating a LinkedHashSet and adding 7 objects
        Set<String> set = new LinkedHashSet<>();
        set.add("Sunday");
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");

        // Removing an object from the set
        set.remove("Wednesday");
        System.out.println(set);
    }
}

