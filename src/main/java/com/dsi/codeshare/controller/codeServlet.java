package com.dsi.codeshare.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/code/*")
public class codeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getPathInfo();
        if (id == null) {
            response.sendRedirect("code.xhtml");
        }
        else{
            request.setAttribute("id", id);
            request.getRequestDispatcher("viewCode.xhtml").forward(request, response);
        }
    }
}
