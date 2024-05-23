package org.xworkz.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.xworkz.configuration.MatrimonyConfig;

public class MatrimonyInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public MatrimonyInit(){
        System.out.println("Initializing MatrimonyInitializer.");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                MatrimonyConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/register",
                "/contact"
        };
    }
}
