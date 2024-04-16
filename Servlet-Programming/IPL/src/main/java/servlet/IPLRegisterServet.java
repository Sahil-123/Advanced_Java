package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

@WebServlet(urlPatterns = "/IPLRegister", loadOnStartup = 1)
public class IPLRegisterServet extends HttpServlet {
    public IPLRegisterServet(){
        System.out.println("IPLRegisterServet object created....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        checkAndAddCoockie(req,resp);

        String fullname = req.getParameter("fullname");
        String dob = req.getParameter("dob");
        String nationality = req.getParameter("nationality");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String preference = req.getParameter("preference");
        String teamRole = req.getParameter("teamRole");
        String ePhone = req.getParameter("ePhone");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String jerseySize = req.getParameter("jerseySize");
        String termCondition = req.getParameter("termCondition");

        System.out.println("Fullname: " + fullname);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Nationality: " + nationality);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Preference: " + preference);
        System.out.println("Team Role: " + teamRole);
        System.out.println("Emergency Phone: " + ePhone);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Jersey Size: " + jerseySize);
        System.out.println("Terms and Conditions: " + termCondition);

        req.setAttribute("fullname", fullname);
        req.setAttribute("dob", dob);
        req.setAttribute("nationality", nationality);
        req.setAttribute("phone", phone);
        req.setAttribute("address", address);
        req.setAttribute("preference", preference);
        req.setAttribute("teamRole", teamRole);
        req.setAttribute("ePhone", ePhone);
        req.setAttribute("height", height);
        req.setAttribute("weight", weight);
        req.setAttribute("jerseySize", jerseySize);
        req.setAttribute("termCondition", termCondition);

        RequestDispatcher dispatcher = req.getRequestDispatcher("message.jsp");
        dispatcher.forward(req,resp);
    }

    private void checkAndAddCoockie(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        String cookieName = "IPL_COOKIE";

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
