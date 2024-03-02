package com.xworkz.runner.NoDuplicateList;

import java.util.ArrayList;
import java.util.List;

public class NoDuplicateList <T> {
    private List<T> list = new ArrayList<>();

    NoDuplicateList(){

    }

    public boolean add(T newElement){

        if(list.contains(newElement)){
            return false;
        }

        list.add(newElement);

        return true;
    }

    public void printList(){
        list.forEach(System.out::println);
    }
}
