package org.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("org.xworkz")
public class MatrimonyConfig {

    @Bean
    public ViewResolver viewResolver(){
        System.out.println("View Resolver intiated..");
       return new InternalResourceViewResolver("/",".jsp");
    }

}
