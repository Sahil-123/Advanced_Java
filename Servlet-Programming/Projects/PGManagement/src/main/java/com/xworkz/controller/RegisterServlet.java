package com.xworkz.controller;

import com.xworkz.service.RegisterService;
import com.xworkz.service.RegisterServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(RegisterServlet.class);
    public RegisterServlet(){
        System.out.println(" RegisterServlet initialized successfully");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Customer register is processing...");
        RegisterService registerService = new RegisterServiceImpl();
        registerService.register(req,resp);
    }

}
