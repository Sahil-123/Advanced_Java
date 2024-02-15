package com.xworkz.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CampingItemsRunner {
    public static void main(String[] args) {
        List<String> campingItems = new ArrayList<>();
        campingItems.add("Tent");
        campingItems.add("Sleeping bag");
        campingItems.add("Camp stove");
        campingItems.add("Flashlight");
        campingItems.add("First aid kit");
        campingItems.add("Water bottle");
        campingItems.add("Hiking boots");
        campingItems.add("Mosquito repellent");
        campingItems.add("Camp chairs");
        campingItems.add("Portable grill");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Original List");
        System.out.println(campingItems);

        System.out.println("------------------------contains t ----------------------------------------");

        campingItems.stream().filter(e->e.contains("t")).forEach(System.out::println);

        System.out.println("-------------------------Descending order ---------------------------------------");

        campingItems.stream().sorted((e1,e2)->e2.compareTo(e2)).forEach(System.out::println);

        System.out.println("-------------------------length greater than 5 ---------------------------------------");

        campingItems.stream().filter(e->e.length() >= 5).sorted((e1,e2)->e2.compareTo(e2)).forEach(System.out::println);

        System.out.println("-------------------------to uppercase ---------------------------------------");

        List<String> list = campingItems.stream().filter(e->e.contains("a")).map(e->e.toUpperCase()).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("-------------------------contains t count---------------------------------------");

        System.out.println(campingItems.stream().filter(e->e.contains("t")).count());

        System.out.println("-------------------------contains a and o and sort in Ascending---------------------------------------");

        campingItems.stream().filter((e)-> e.contains("a") && e.contains("o")).sorted().collect(Collectors.toList()).forEach(System.out::println);
        
    }
}
