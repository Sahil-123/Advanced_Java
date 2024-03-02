package com.xworkz.runner.listManupulation;

import java.util.*;
public class sortListByalphabeticOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("suhas");
        list.add("omkar");
        list.add("sahil");
        list.add("nandish");

        list.sort((e1,e2)->e1.compareTo(e2));

        list.forEach(System.out::println);

    }
}
