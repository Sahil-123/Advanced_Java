package com.xworkz.runner.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("rahul");
        set.add("suhas");
        set.add("omkar");
        set.add("sahil");
        set.add("nandish");

        set.forEach(System.out::println);
        System.out.println("==========After removal of element======");

//        Remove element from the set.
        set.remove("sahil");
        set.forEach(System.out::println);
        System.out.println();

//        iterator the set using iterator
        System.out.println("===============iterating using iterator=============");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");

//        check element exist in set
        System.out.println("Element sahil is exist in set : "+set.contains("sahil"));




    }
}
