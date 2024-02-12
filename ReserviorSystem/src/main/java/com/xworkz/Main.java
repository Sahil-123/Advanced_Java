package com.xworkz;

import com.xworkz.DTO.ReserviorDTO;
import com.xworkz.services.ReserviorService;
import com.xworkz.services.ReserviorServiceImpl;

public class Main {

//    public static String reverseString(String str){
//        StringBuilder result = new StringBuilder(str);
//
//        int lastPointer = str.length()-1;
//        int initialPointer = 0;
//
//        while(initialPointer < lastPointer){
//            char temp = result.charAt(initialPointer);
//            result.setCharAt(initialPointer,result.charAt(lastPointer));
//            result.setCharAt(lastPointer,temp);
//            initialPointer++;
//            lastPointer--;
//        }
//
//        return result.toString();
//    }

    public static void main(String[] args) {

        ReserviorService reserviorService = new ReserviorServiceImpl();

        System.out.println("Service Initiated");
        ReserviorDTO reserviorDTO = new ReserviorDTO("abc","dharwad","karnataka",13.8);

        reserviorService.save(reserviorDTO);

        reserviorService.update("abc","Pune","Maharashtra",12.9);

        reserviorService.findAll();

//        String s = "abcdef";
//        System.out.println(reverseString(s));

    }
}