package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "carrot", urlPatterns = "/carrot", loadOnStartup = 1)
public class Carrot extends HttpServlet {
    public Carrot(){
        System.out.println("--------------------------------------------");
        System.out.println("object of Carrot is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Carrot call from : "+req.getRemoteAddr());
    }
}
