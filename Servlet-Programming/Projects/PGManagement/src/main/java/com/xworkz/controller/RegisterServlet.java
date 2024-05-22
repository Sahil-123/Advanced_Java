package com.xworkz.controller;

import com.xworkz.service.RegisterService;
import com.xworkz.service.RegisterServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
@Slf4j
public class RegisterServlet extends HttpServlet {
    public RegisterServlet(){
        log.info(" RegisterServlet initialized successfully");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Customer register is in processing...");
        RegisterService registerService = new RegisterServiceImpl();
        registerService.register(req,resp);
        log.info("Customer registered successfully");
    }

}
