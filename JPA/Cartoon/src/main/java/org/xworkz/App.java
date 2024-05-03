package org.xworkz;

import org.xworkz.dto.Cartoon;
import org.xworkz.repository.CartoonRepositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CartoonRepositoryImpl cartoonRepository=new CartoonRepositoryImpl();
        System.out.println( "initiating process.." );

//        System.out.println("saving data...");
//        cartoonRepository.save(new Cartoon("xyz","male","aaa","abc"));
//        cartoonRepository.save(new Cartoon("xyz1","female","aaa","abcd"));
//        cartoonRepository.save(new Cartoon("xyz2","Female","aaa","abcde"));

//        System.out.println();
//        System.out.println("fetching data...");
//        System.out.println(cartoonRepository.find(1));
//
//        System.out.println();
//        System.out.println("updating the data");
//        cartoonRepository.update(1,"yyy");
//        System.out.println(cartoonRepository.find(1));
//
//        System.out.println();
//        System.out.println("deleting the data");
//        cartoonRepository.delete(1);
//        System.out.println(cartoonRepository.find(1));
//
        System.out.println();
        System.out.println("fetching the data by cartoon name.");
//        System.out.println(cartoonRepository.getCartoonByName("xyz1"));
//
        System.out.println();
        System.out.println("fetching the data by cartoon gender pattern");
        System.out.println(cartoonRepository.getCartoonByGenderMatches("fe"));
//
        System.out.println();
        System.out.println("fetching the data by cartoon types");
//        System.out.println(cartoonRepository.getCartoonByTypes(Arrays.asList("abc","abcd","abcde")));

    }
}
