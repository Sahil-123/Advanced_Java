package servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coockies", loadOnStartup = 1)
public class CoockiesServlet extends HttpServlet {

    public CoockiesServlet(){
        System.out.println("CoockiesServlet object is created...");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("MyNewCookie", "My-new-Cookie");

        // Set the cookie's expiration date.
        cookie.setMaxAge(60); // 1 hour

        // Add the cookie to the response.
        resp.addCookie(cookie);

        Cookie[] cookies = req.getCookies();

        if(cookies !=null && cookies.length > 0){
            System.out.println(cookies[0].getValue());
        }
    }
}
