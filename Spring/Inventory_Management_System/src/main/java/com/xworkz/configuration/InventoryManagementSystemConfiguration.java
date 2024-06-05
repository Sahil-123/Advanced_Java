package com.xworkz.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class InventoryManagementSystemConfiguration {

    public InventoryManagementSystemConfiguration(){
        System.out.println("InventoryManagementSystemConfiguration configuration created.");
    }

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }

}
