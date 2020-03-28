/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chattyserver;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "LoginAction", urlPatterns = {"/LoginAction"})
public class LoginAction extends HttpServlet {

    private String uname, pwd;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        uname = request.getParameter("uname");
        pwd = request.getParameter("pwd");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(uname);
        out.println(pwd);
        
        System.out.println("UserName : "+uname);
        System.out.println("Password : "+pwd);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
