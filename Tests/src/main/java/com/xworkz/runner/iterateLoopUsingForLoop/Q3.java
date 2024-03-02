package com.xworkz.runner.iterateLoopUsingForLoop;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("suhas");
        list.add("omkar");
        list.add("sahil");
        list.add("nandish");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
