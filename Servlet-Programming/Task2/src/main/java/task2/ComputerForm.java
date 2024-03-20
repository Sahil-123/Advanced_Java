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


//        resp.getWriter().println("<b> Your order is in under process <b> <br><br>");
//
//
//        resp.getWriter().println("<pre>");
//
//        resp.getWriter().println("Brand: " + brand);
//        resp.getWriter().println("Model: " + model);
//        resp.getWriter().println("Color: " + color);
//        resp.getWriter().println("Computer Type: " + computerType);
//        resp.getWriter().println("RAM Size: " + ramSize);
//        resp.getWriter().println("Hard Disk Size: " + hardDiskSize);
//        resp.getWriter().println("Processor Type: " + processorType);
//        resp.getWriter().println("Processor Generation: " + processorGeneration);
//        resp.getWriter().println("Motherboard Type: " + motherboardType);
//        resp.getWriter().println("Cache Size: " + cacheSize);
//        resp.getWriter().println("Cost: " + cost);
//        resp.getWriter().println("Quantity: " + quantity);
//
//        resp.getWriter().println("</pre>");
//
//
//        resp.getWriter().println("<br><br>");
//
//        resp.getWriter().println("<h2>Total Amount : "+cost * quantity+"</h2>");

        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"Bootstrap.css\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n" +
                "        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n" +
                "        crossorigin=\"anonymous\"></script>\n" +
                "<style>\n" +
                        "table {\n" +
                        "              width: auto;\n" +
                        "              border-collapse: collapse;\n" +
                        "            }\n" +
                        "        \n" +
                        "            th, td {\n" +
                        "              padding: 8px;\n" +
                        "              text-align: left;\n" +
                        "            }"+
                        "  </style>"+
                "    <title>Response</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
                "        <div class=\"container-fluid\">\n" +
                "          <a class=\"navbar-brand\" href=\"index.html\">Mash</a>\n" +
                "          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "            <span class=\"navbar-toggler-icon\"></span>\n" +
                "          </button>\n" +
                "          <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                "            <ul class=\"navbar-nav\">\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a class=\"nav-link\" aria-current=\"page\" href=\"index.html\">Home</a>\n" +
                "              </li>\n" +
                "              <li class=\"nav-item\">\n" +
                "                <a class=\"nav-link\" href=\"about.html\">About</a>\n" +
                "              </li>\n" +
                "              <li class=\"nav-item\">\n" +
                "                <div class=\"dropdown\">\n" +
                "                    <a class=\"btn btn-secondary dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\"\n" +
                "                        data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n" +
                "                        Applications\n" +
                "                    </a>\n" +
                "\n" +
                "                    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n" +
                "                        <a class=\"dropdown-item\" href=\"computer.html\">Computer parts</a>\n\n" +
                "                        <!-- <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
                "                        <a class=\"dropdown-item\" href=\"#\">Something else here</a> -->\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "              </li>\n" +
                "            </ul>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </nav>\n" +
                "\n" +
                "    <div class=\"container mt-5 mb-5\">\n" +
                "        <div class=\"card text-center\">\n" +
                "            <div class=\"card-header bg-success text-white\">\n" +
                "             <h3> Your order is processing.... </h3>\n" +
                "            </div>\n" +
                "            <div class=\"card-body d-flex justify-content-center\">\n" +
                "<table>\n" +
                        "  <tr>\n" +
                        "    <td>Brand</td>\n" +
                        "    <td>: " + brand + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Model</td>\n" +
                        "    <td>: " + model + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Color</td>\n" +
                        "    <td>: " + color + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Computer Type</td>\n" +
                        "    <td>: " + computerType + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>RAM Size</td>\n" +
                        "    <td>: " + ramSize + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Hard Disk Size</td>\n" +
                        "    <td>: " + hardDiskSize + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Processor Type</td>\n" +
                        "    <td>: " + processorType + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Processor Generation</td>\n" +
                        "    <td>: " + processorGeneration + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Motherboard Type</td>\n" +
                        "    <td>: " + motherboardType + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Cache Size</td>\n" +
                        "    <td>: " + cacheSize + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Cost</td>\n" +
                        "    <td>: " + cost + "</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Quantity</td>\n" +
                        "    <td>: " + quantity + "</td>\n" +
                        "  </tr>\n" +
                        "</table>\n" +
                "            </div>\n" +
                "            <div class=\"card-footer\">\n" +
                "                <h5 class=\"card-title\"> <b> Total Amount : &#8377 "+cost * quantity+"</b> </h5>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>");


    }
}
