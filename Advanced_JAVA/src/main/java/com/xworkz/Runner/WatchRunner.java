package com.xworkz.Runner;

import com.xworkz.DTO.WatchDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {
        // Creating a list to hold WatchDTO objects
        List<WatchDTO> watchList = new ArrayList<>();

        // Adding five different WatchDTO objects to the list
        watchList.add(new WatchDTO("Rolex", 100.0, 38L, "Analog"));
        watchList.add(new WatchDTO("Casio", 50.0, 35L, "Digital"));
        watchList.add(new WatchDTO("Tag Heuer", 300.0, 42L, "Chronograph"));
        watchList.add(new WatchDTO("Seiko", 200.0, 40L, "Automatic"));
        watchList.add(new WatchDTO("Fossil", 150.0, 37L, "Hybrid"));

        // Displaying the contents of the list
        Collections.sort(watchList,(p1, p2)->p1.getBrand().compareTo(p2.getBrand()));
        System.out.println("Ascending by brand---------");
        watchList.forEach((element)-> System.out.println(element));

        Collections.sort(watchList,(p1, p2)->p2.getBrand().compareTo(p1.getBrand()));
        System.out.println("Descending by brand---------");
        watchList.forEach((element)-> System.out.println(element));


//        price
        Collections.sort(watchList,(p1, p2)-> Double.compare(p1.getPrice(),p2.getPrice()));
        System.out.println("Ascending by price---------");
        watchList.forEach((element)-> System.out.println(element));

        Collections.sort(watchList,(p1, p2)-> Double.compare(p2.getPrice(),p1.getPrice()));
        System.out.println("Descending by price---------");
        watchList.forEach((element)-> System.out.println(element));


//      size
        Collections.sort(watchList,(p1, p2)-> Long.compare(p1.getSize(),p2.getSize()));
        System.out.println("Ascending by size---------");
        watchList.forEach((element)-> System.out.println(element));

        Collections.sort(watchList,(p1, p2)-> Long.compare(p2.getSize(),p1.getSize()));
        System.out.println("Descending by size---------");
        watchList.forEach((element)-> System.out.println(element));

    }
}
