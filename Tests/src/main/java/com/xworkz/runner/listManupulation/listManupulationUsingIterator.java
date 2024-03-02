package com.xworkz.runner.listManupulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listManupulationUsingIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);

        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("adding element to list via listIterator");
        while (iterator.hasNext()){
            if (iterator.next() == 2){
                iterator.add(4);
            }
        }

        list.forEach(System.out::println);

       System.out.println("==removing even number element from the list via ListIterator====");
       iterator = list.listIterator();
        while (iterator.hasNext()){
            if (iterator.next()%2 == 0){
                iterator.remove();
            }
        }

        list.forEach(System.out::println);

    }
}
