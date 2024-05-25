package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "beetroot", urlPatterns = "/beetroot", loadOnStartup = 1)
public class Beetroot extends HttpServlet {
    public Beetroot(){
        System.out.println("--------------------------------------------");
        System.out.println("object of Beetroot is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Beetroot call from : "+req.getRemoteAddr());
    }
}
