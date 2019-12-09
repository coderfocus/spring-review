package com.coderfocus.controller;

import com.coderfocus.commons.context.SpringContext;
import com.coderfocus.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserController extends HttpServlet {

    UserService userService = (UserService) SpringContext.getBean("userService");

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer =resp.getWriter();
        writer.write(userService.getMessage());
    }
}
