package org.xworkz.configuration;


import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.xworkz.Beans.Coffee;
import org.xworkz.pojo.Mug;
import org.xworkz.pojo.Snake;
import org.xworkz.pojo.Spoon;
import org.xworkz.pojo.Temple;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

@Configuration
@ComponentScans({
        @ComponentScan("org.xworkz"),
        @ComponentScan("org.oracle"),
})
public class FlightConfig {
    public FlightConfig(){
        System.out.println("Running FlightConfig....");
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//        c.setLocation(new ClassPathResource("db.properties"));
//        return c;
//    }

    @Bean
    public String name(){
        System.out.println("Getting initializing String...");
        return "I am sahil";
    }

    @Bean
    public String mail(){
        System.out.println("Getting initializing String...");
        return "sahilnaikwadi123@gmail.com";
    }

    @Bean
    public char[] getCharArray(){
        System.out.println("Getting initializing Char Array...");
        return new char[]{'A','B','C'};
    }

    @Bean
    public LinkedList<?> getLinkedList(){
        System.out.println("Getting initializing LinkedList...");
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Hi");

        return list;
    }

    @Bean
    public Map<?,?> getMap(){
        System.out.println("Getting initializing Map...");
        Map<String,String> map=new HashMap<>();
        map.put("001","sahil");

        return map;
    }

    @Bean
    public Properties getProperties() throws IOException {
        System.out.println("Getting initializing Propeties...");

        FileReader reader=new FileReader("D:\\JDBC Workz\\Spring\\Spring-proj1\\src\\main\\java\\org\\xworkz\\properties\\db.properties");
        Properties properties=new Properties();
        properties.load(reader);

        return properties;
    }

    @Bean
    public Temple getTemple(){
        System.out.println("Getting initializing Temple...");
        return new Temple();
    }

    @Bean
    public Spoon getSpoon(){
        System.out.println("Getting initializing Spoon...");
        return new Spoon();
    }

    @Bean
    public Snake getSnake(){
        System.out.println("Getting initializing Snake...");
        return new Snake();
    }

    @Bean
    public Mug getMug(){
        System.out.println("Getting initializing Mug...");
        return new Mug();
    }

    @Bean
    public Coffee coffee(){
        System.out.println("Getting initializing Coffee");
        return new Coffee();
    }

}
