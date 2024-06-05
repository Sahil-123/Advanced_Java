package com.xworkz.initializer;

import com.xworkz.configuration.DBConfiguration;
import com.xworkz.configuration.InventoryManagementSystemConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InventoryManagementSystemInit
        extends AbstractAnnotationConfigDispatcherServletInitializer
        implements WebMvcConfigurer {

    public InventoryManagementSystemInit(){
        System.out.println("InventoryManagementSystemInit initializing....");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                InventoryManagementSystemConfiguration.class,
                DBConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
