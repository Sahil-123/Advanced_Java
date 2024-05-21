package org.xworkz.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DBProperties {

    @Value("${username}")
    private String username;

    public String getUsername() {
        return this.username;
    }

    @Override
    public String toString() {
        return "DBProperties{" +
                "username='" + username + '\'' +
                '}';
    }

    public DBProperties(){
        System.out.println("DBProperties object is created...");
//        System.out.println("db properties: "+this.username);
    }


    @Bean
    public String testValues(){
//        System.out.println("db properties: "+this.username);
        return "value";
    }
}
