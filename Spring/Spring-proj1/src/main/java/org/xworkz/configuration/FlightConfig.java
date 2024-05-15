package org.xworkz.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
@ComponentScan("org.xworkz")
public class FlightConfig {
    public FlightConfig(){
        System.out.println("Running FlightConfig....");
    }

    @Bean
    public String getString(){
        System.out.println("Getting initializing String...");
        return "hi i am string";
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

}
