package com.example.demo;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void init() {
        // Initialization logic, if needed
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hasil Persamaan Kuadrat</h1>");

        // Memeriksa apakah a = 0 (bukan persamaan kuadrat)
        if (a == 0) {
            out.println("<p>Ini bukan persamaan kuadrat karena a = 0.</p>");
        } else {
            // Menghitung diskriminan
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Dua akar nyata
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                out.println("<p>Akar-akar persamaan: "+ a+"x2 +"+-1*b+"x +" +c +"</p>");
                out.println("<p>Akar 1: " + root1 + "</p>");
                out.println("<p>Akar 2: " + root2 + "</p>");
            } else if (discriminant == 0) {
                // Satu akar nyata
                double root = -b / (2 * a);
                out.println("<p>Persamaan memiliki satu akar: " + root + "</p>");
            } else {
                // Akar imajiner
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                out.println("<p>Persamaan memiliki akar imajiner:</p>");
                out.println("<p>Akar 1: " + realPart + " + " + imaginaryPart + "i</p>");
                out.println("<p>Akar 2: " + realPart + " - " + imaginaryPart + "i</p>");
            }
        }
        out.println("</body></html>");

    }

    public void destroy() {
        // Cleanup code, if needed
    }
}
