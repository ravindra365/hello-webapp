package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    // No-arg constructor (optional - implicit if none defined)
    public HelloServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        try (PrintWriter out = res.getWriter()) {
            out.println("<h1>Hello there, how are you?</h1>");
        }
    }
}
