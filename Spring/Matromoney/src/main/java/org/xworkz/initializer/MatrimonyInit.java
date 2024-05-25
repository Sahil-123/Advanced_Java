package org.xworkz.initializer;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.xworkz.configuration.MatrimonyConfig;

public class MatrimonyInit extends AbstractAnnotationConfigDispatcherServletInitializer
        implements WebMvcConfigurer {

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
                "/"                 // this tells the server to pass the all requests to DispatcherServlet
        };
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();        // it tells the server to if Dispatcher Servlet not able to map the
                                    // request then pass it to default servlet to map in static resources.
    }

}
