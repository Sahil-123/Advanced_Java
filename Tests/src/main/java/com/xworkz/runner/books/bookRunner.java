package com.xworkz.runner.books;

import com.xworkz.dto.bookDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class bookRunner {
    public static void main(String[] args) {
        List<bookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(new bookDTO("abc","xxx","aaa", LocalDate.now().minusMonths(3),3,300.9));
        bookDTOList.add(new bookDTO("abd","xxx","bbb", LocalDate.now().minusMonths(2),4,304.9));
        bookDTOList.add(new bookDTO("abe","yyy","aaa", LocalDate.now().minusMonths(1),5,305.9));
        bookDTOList.add(new bookDTO("abf","yyy","ccc", LocalDate.now().minusMonths(5),5,500.9));
        bookDTOList.add(new bookDTO("abg","zzz","bbb", LocalDate.now().minusMonths(6),3,700.9));
        bookDTOList.add(new bookDTO("abc","zzz","ddd", LocalDate.now().minusMonths(7),5,800.9));

        bookDTOList.forEach(System.out::println);

        System.out.println("===== list of books by genres as xxx ======");
        bookDTOList.stream().filter(e->e.getGenres().equals("xxx")).forEach(System.out::println);

        System.out.println("===== list of books that are published in past 6th months ====");
        bookDTOList.stream().filter(e->{

            LocalDate before = LocalDate.now().minusMonths(6);
            LocalDate now = LocalDate.now();

            return e.getPublicationYear().isBefore(now) && e.getPublicationYear().isAfter(before);

        }).forEach(System.out::println);


        System.out.println("=== count the number of book of particular auther ====");
        long count = bookDTOList.stream().filter(e->e.getAuther().equals("aaa")).count();
        System.out.println("number of books of auther aaa : "+count);

        System.out.println("=== highest rating books ===");
        int highestRating = bookDTOList.stream().map(e-> e.getRating()).sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList()).get(0);
        bookDTOList.stream().filter(e->e.getRating() >= highestRating).forEach(System.out::println);

        System.out.println("=== sum of all books price ===");
        System.out.println("Sum of all books price : "+bookDTOList.stream().map(e-> e.getPrice()).reduce((c,a)->c+a));
    }
}
