package com.xworkz.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoeRunner {
    public static void main(String[] args) {
        // Create a list to hold brand names
        List<String> brandList = new ArrayList<>();

        // Adding brand names to the list
        brandList.add("Nike");
        brandList.add("Adidas");
        brandList.add("Puma");
        brandList.add("Reebok");
        brandList.add("New Balance");
        brandList.add("Vans");
        brandList.add("Converse");
        brandList.add("Under Armour");
        brandList.add("ASICS");
        brandList.add("Skechers");


        System.out.println("Foreword iterating");
//        forword
        ListIterator<String> stringListIterator = brandList.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        System.out.println();
        System.out.println("Reverse iterating");
//        reverse
        stringListIterator = brandList.listIterator(brandList.size());
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

        System.out.println();
        System.out.println("middle Forword iterating");
//      middle foreword
        stringListIterator = brandList.listIterator(brandList.size()/2);
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        System.out.println();
        System.out.println("Middle Reverse iterating");
//      middle backword
        stringListIterator = brandList.listIterator(brandList.size()/2);
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

        System.out.println();
        System.out.println("Puma removed");
//      remove puma
        stringListIterator = brandList.listIterator();
        while(stringListIterator.hasNext()){
            if(stringListIterator.next().equals("Puma")){
                stringListIterator.remove();
            }
        }

        brandList.forEach(System.out::println);



        System.out.println();
        System.out.println("Puma added");
//      add puma
        stringListIterator = brandList.listIterator();
        while(stringListIterator.hasNext()){
            if(stringListIterator.next().equals("Adidas")){
                stringListIterator.add("Puma");
            }
        }

//        Printing
        brandList.forEach(System.out::println);

    }
}
