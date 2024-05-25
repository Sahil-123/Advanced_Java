package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "chilli", urlPatterns = "/chilli", loadOnStartup = 1)
public class Chilli extends HttpServlet {
    public Chilli(){
        System.out.println("--------------------------------------------");
        System.out.println("object of Chilli is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chilli call from : "+req.getRemoteAddr());
    }
}
