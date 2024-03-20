package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "tomato", urlPatterns = "/tomato", loadOnStartup = 1)
public class Tomato extends HttpServlet {
    public Tomato(){
        System.out.println("--------------------------------------------");
        System.out.println("object of Tomato is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Tomato call from : "+req.getRemoteAddr());
    }
}
