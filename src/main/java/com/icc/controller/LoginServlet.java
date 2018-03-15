package com.icc.controller;

import com.icc.pojo.LoginUser;
import com.icc.service.LoginService;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json; charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username========== " + username);
        System.out.println("passowrd===========" + password);
        try {
            LoginUser user = LoginService.doLogin(username, password);
            if(user.getUsername() != "") {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/success.jsp");
                req.setAttribute("username", user.getUsername());
                dispatcher.forward(req, resp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
