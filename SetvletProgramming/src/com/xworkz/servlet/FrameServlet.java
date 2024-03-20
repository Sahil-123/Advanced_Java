package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "frameServlet", urlPatterns = "/frame", loadOnStartup = 1)
public class FrameServlet extends HttpServlet {
    public FrameServlet(){
        System.out.println("--------------------------------------------");
        System.out.println("object of FrameServlet is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("call from : "+req.getRemoteAddr());
    }
}
