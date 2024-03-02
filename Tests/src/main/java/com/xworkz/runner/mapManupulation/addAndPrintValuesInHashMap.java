package com.xworkz.runner.mapManupulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class addAndPrintValuesInHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();

        map.put("sahil",20);
        map.put("rahul",25);
        map.put("omkar",23);
        map.put("nandish",21);
        map.put("suhas",26);

        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        entries.stream().forEach((entry)-> System.out.println(entry.getKey()+" : "+entry.getValue()));

    }
}
