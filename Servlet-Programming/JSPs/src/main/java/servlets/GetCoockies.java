package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getCookie", loadOnStartup = 1)
public class GetCoockies extends HttpServlet {
    public GetCoockies(){
        System.out.println("Get Coockie object is created.....");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        resp.setContentType("text/plain");

        if(cookies !=null){
            for(Cookie cookie: cookies){
                resp.getWriter().println(cookie.getName()+" : "+cookie.getValue());
            }
        }else{
            resp.getWriter().println("No Cookie found....!");
        }
    }
}
