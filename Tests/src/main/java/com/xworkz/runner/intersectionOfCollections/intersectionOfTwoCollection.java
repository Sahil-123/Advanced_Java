package com.xworkz.runner.intersectionOfCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersectionOfTwoCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("rahul");
        set.add("suhas");
        set.add("omkar");
        set.add("sahil");
        set.add("nandish");


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("e");
        list.add("d");
        list.add("c");
        list.add("sahil");
        list.add("nandish");

        list.stream().filter(e->set.contains(e)).forEach(System.out::println);
    }
}
