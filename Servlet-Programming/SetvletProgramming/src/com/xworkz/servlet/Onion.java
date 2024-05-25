package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "onion", urlPatterns = "/onion", loadOnStartup = 1)
public class Onion extends HttpServlet {
    public Onion(){
        System.out.println("--------------------------------------------");
        System.out.println("object of Onion is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Onion call from : "+req.getRemoteAddr());
    }
}
