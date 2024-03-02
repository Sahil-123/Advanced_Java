package com.xworkz.runner.mergeCollectionInList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class mergeAllSortedCollectionInSingleList {
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


        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(set.stream().sorted().collect(Collectors.toList()));
        mergedList.addAll(list.stream().sorted().collect(Collectors.toList()));

        mergedList.forEach(System.out::println);

    }
}
