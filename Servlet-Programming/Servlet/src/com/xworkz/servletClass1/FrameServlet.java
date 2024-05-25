package com.xworkz.servletClass1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "frameServlet",urlPatterns = "/frame", loadOnStartup = 1)
public class FrameServlet extends HttpServlet {
    public FrameServlet(){
        System.out.println("FrameServlet class is created.....");

    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("service request is made...by : "+req.getRemoteAddr());
//        String name = req.getParameter("name");
//        System.out.println("service request is made...by : " + name);
//    }
}
