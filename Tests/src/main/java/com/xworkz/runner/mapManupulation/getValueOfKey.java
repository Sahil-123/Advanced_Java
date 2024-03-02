package com.xworkz.runner.mapManupulation;

import java.util.HashMap;
import java.util.Map;

public class getValueOfKey {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();

        map.put("sahil",20);
        map.put("rahul",25);
        map.put("omkar",23);
        map.put("nandish",21);
        map.put("suhas",26);

        System.out.println("Getting sahil's age using sahil as key : "+map.get("sahil"));
    }
}
