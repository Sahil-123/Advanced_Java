package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


@WebServlet(urlPatterns = "/contactRegister", loadOnStartup = 1)
public class ContactRegister extends HttpServlet {


    public ContactRegister(){
        System.out.println("ContactRegister object is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        req.getSession().setAttribute("email",email);
        req.getSession().setAttribute("phone",phone);

        if(checkCoockie(req,resp)){
            req.getRequestDispatcher("result.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    private boolean checkCoockie(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        String cookieName = "XWORKZ_COOKIE";

        Cookie[] cookies = req.getCookies();

        boolean exists = false;

        if(cookies !=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(cookieName)){
                    exists = true;
                    break;
                }
            }
        }

        if(exists){
            return true;
        }

        return false;
    }
}
