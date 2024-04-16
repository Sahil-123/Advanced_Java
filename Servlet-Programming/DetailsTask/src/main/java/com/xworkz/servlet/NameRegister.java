package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


@WebServlet(urlPatterns = "/nameRegister",loadOnStartup = 1)
public class NameRegister extends HttpServlet {

    public  NameRegister(){
        System.out.println("NameRegister object is created.....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        checkAndAddCoockie(req,resp);

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");

        req.getSession().setAttribute("fname",fname);
        req.getSession().setAttribute("lname",lname);

        req.getRequestDispatcher("ContactDetails.jsp").forward(req,resp);
    }

    private void checkAndAddCoockie(HttpServletRequest req,HttpServletResponse resp) throws IOException {
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

        if(!exists){
            UUID uuid = UUID.randomUUID();
            String uuidString = uuid.toString();

            String coockieValue = uuidString.substring(0, 20);

            Cookie cookie = new Cookie(cookieName, coockieValue.toUpperCase());
            cookie.setMaxAge(60*1);
            resp.addCookie(cookie);
        }
    }

}
