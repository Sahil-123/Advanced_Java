package org.xworkz.initiliazer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.xworkz.configuration.ApplicationProperties;
import org.xworkz.configuration.FlightConfig;

public class SpringServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    public SpringServletInit(){
        System.out.println("initializing SpringServletInit ....");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running getRootConfigClasses");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running getServletConfigClasses");
        return new Class[]{
                FlightConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running getServletMappings");
        return new String[]{
                "/send"
        };
    }
}
