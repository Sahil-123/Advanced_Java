package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/tvRecharge", loadOnStartup = 1)
public class TvRecharge extends HttpServlet {

    public TvRecharge(){
        System.out.println("Tv Recharge object is created");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId = req.getParameter("customerId");
        String vendor = req.getParameter("vendor");
        String amount = req.getParameter("amount");
        String rechargeType = req.getParameter("rechargeType");
        String termCondition = req.getParameter("termCondition");

        System.out.println("customerId: " + customerId);
        System.out.println("vendor: " + vendor);
        System.out.println("amount: " + amount);
        System.out.println("rechargeType: " + rechargeType);
        System.out.println("termCondition: " + termCondition);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String htmlTable = "<table>\n" +
                "<tr><td>Customer ID</td><td> : " + customerId + "</td></tr>\n" +
                "<tr><td>Vendor</td><td> : " + vendor + "</td></tr>\n" +
                "<tr><td>Recharge Amount</td><td> : " + amount + "</td></tr>\n" +
                "<tr><td>Recharge Type</td><td> : " + rechargeType + "</td></tr>\n" +
                "<tr><td>Terms & Conditions</td><td> : " + (termCondition.equalsIgnoreCase("on") ? "Yes" : "No") + "</td></tr>\n" +
                "</table>";

        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\" />\n" +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "  <link rel=\"icon\" type=\"image/x-icon\" href=\"xworkz-logo.png\">\n" +
                "  <link rel=\"stylesheet\" href=\"Bootstrap.css\" />\n" +
                "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n" +
                "    integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n" +
                "    crossorigin=\"anonymous\"></script>\n" +
                "  <title>X-workz Digital</title>\n" +
                "        <style>\n" +
                "            table {\n" +
                "              width: auto;\n" +
                "              border-collapse: collapse;\n" +
                "            }\n" +
                "        \n" +
                "            th, td {\n" +
                "              padding: 8px;\n" +
                "              text-align: left;\n" +
                "            }\n" +
                "        \n" +
                "          </style>\n" +
                "    <title>Response</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "  <nav class=\"navbar sticky-top navbar-expand-lg navbar-light\" style=\"background-color: #e3f2fd;\">\n" +
                "    <div class=\"container-fluid\">\n" +
                "      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarTogglerDemo03\"\n" +
                "        aria-controls=\"navbarTogglerDemo03\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "        <span class=\"navbar-toggler-icon\"></span>\n" +
                "      </button>\n" +
                "      <a class=\"\" href=\"index.html\">\n" +
                "        <img src=\"xworkz-logo.png\" style=\"width: 70px; height:30px; \" />\n" +
                "      </a>\n" +
                "\n" +
                "      <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\n" +
                "        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
                "        </ul>\n" +
                "\n" +
                "        <ul class=\"navbar-nav\">\n" +
                "          <li class=\"nav-item\">\n" +
                "            <a class=\"nav-link\" aria-current=\"page\" href=\"index.html\">Home</a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item\">\n" +
                "            <a class=\"nav-link\" href=\"about.html\">About</a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item\">\n" +
                "            <div class=\"dropdown\">\n" +
                "              <a class=\" nav-link\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\"\n" +
                "                data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n" +
                "                Applications\n" +
                "              </a>\n" +
                "\n" +
                "              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n" +
                "                <a class=\"dropdown-item\" href=\"tvRecharge.html\">TV Recharge</a>\n" +
                "                <!-- <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
                "                        <a class=\"dropdown-item\" href=\"#\">Something else here</a> -->\n" +
                "              </ul>\n" +
                "            </div>\n" +
                "          </li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </nav>\n" +
                "\n" +
                "    <div class=\"container mt-5 mb-5\">\n" +
                "        <div class=\"card text-center\">\n" +
                "            <div class=\"card-header bg-success text-white\">\n" +
                "              <h4>Your recharge is processing.... </h4>\n" +
                "            </div> \n" +
                "            <div class=\"card-body d-flex justify-content-center\">\n" +
                htmlTable +
                "            </div>\n" +
                "          </div>\n" +
                "\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>");

    }
}
