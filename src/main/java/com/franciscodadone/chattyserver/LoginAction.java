/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.franciscodadone.chattyserver;

import com.franciscodadone.database.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        uname = request.getParameter("uname");
        pwd = request.getParameter("pwd");
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("Username: " + uname);
            out.println("<br>");
            out.println("Password: " + pwd);
            
            Connection conexion = Database.getConnection();
            conexion.prepareStatement("CREATE TABLE tabla");
            conexion.commit();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
            
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
