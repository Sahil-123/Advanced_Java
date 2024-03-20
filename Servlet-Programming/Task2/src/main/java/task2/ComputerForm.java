package task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/computerForm", loadOnStartup = 1)
public class ComputerForm extends HttpServlet {

    public ComputerForm(){
        System.out.println("Computer Form object is created");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        String color = req.getParameter("color");
        String computerType = req.getParameter("computer_type");
        String ramSize = req.getParameter("ram_size");
        String hardDiskSize = req.getParameter("hard_disk_size");
        String processorType = req.getParameter("processor_type");
        String processorGeneration = req.getParameter("processor_generation");
        String motherboardType = req.getParameter("motherboard_type");
        String cacheSize = req.getParameter("cache_size");
        Long cost = Long.valueOf(req.getParameter("cost"));
        Integer quantity = Integer.valueOf(req.getParameter("quantity"));

        resp.setContentType("text/html");


        resp.getWriter().println("<b> Your order is in under process <b> <br><br>");


        resp.getWriter().println("<pre>");

        resp.getWriter().println("Brand: " + brand);
        resp.getWriter().println("Model: " + model);
        resp.getWriter().println("Color: " + color);
        resp.getWriter().println("Computer Type: " + computerType);
        resp.getWriter().println("RAM Size: " + ramSize);
        resp.getWriter().println("Hard Disk Size: " + hardDiskSize);
        resp.getWriter().println("Processor Type: " + processorType);
        resp.getWriter().println("Processor Generation: " + processorGeneration);
        resp.getWriter().println("Motherboard Type: " + motherboardType);
        resp.getWriter().println("Cache Size: " + cacheSize);
        resp.getWriter().println("Cost: " + cost);
        resp.getWriter().println("Quantity: " + quantity);

        resp.getWriter().println("</pre>");


        resp.getWriter().println("<br><br>");

        resp.getWriter().println("<h2>Total Amount : "+cost * quantity+"</h2>");


    }
}
