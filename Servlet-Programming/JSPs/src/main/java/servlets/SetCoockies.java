package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

@WebServlet(urlPatterns = "/setCookie", loadOnStartup = 1)
public class SetCoockies extends HttpServlet {

    public SetCoockies(){
        System.out.println("Object of Set Cookies is created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cookieName = "coockie-1";

        Cookie[] cookies = req.getCookies();

        resp.setContentType("text/plain");

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
            Random random = new Random();
            String coockieValue = ""+random.nextInt(1234567890);
            Cookie cookie = new Cookie(cookieName, Integer.toHexString(Objects.hash(coockieValue)));
            cookie.setMaxAge(60); // 1 hour
            resp.addCookie(cookie);
            resp.getWriter().println("Coockie Successfully set...");
        }else {
            resp.getWriter().println("Coockie already exists...");
        }

    }
}
