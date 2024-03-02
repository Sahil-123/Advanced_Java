package com.xworkz.runner.NoDuplicateList;

import java.util.ArrayList;
import java.util.List;



public class NoDuplicateListMain {

    public static void main(String[] args) {
        NoDuplicateList<String> list = new NoDuplicateList<>();
        list.add("rahul");
        list.add("suhas");
        list.add("omkar");
        list.add("sahil");
        list.add("nandish");

        System.out.println(list.add("sahil"));
        System.out.println(list.add("nandish"));
        System.out.println();

        list.printList();
    }
}
