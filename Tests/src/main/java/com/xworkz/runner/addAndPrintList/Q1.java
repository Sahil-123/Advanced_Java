package com.xworkz.runner.addAndPrintList;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("suhas");
        list.add("omkar");
        list.add("sahil");
        list.add("nandish");

        list.forEach(System.out::println);
    }
}
