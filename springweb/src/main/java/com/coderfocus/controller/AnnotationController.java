package com.coderfocus.controller;

import com.coderfocus.commons.context.AutoSpringContext;
import com.coderfocus.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AnnotationController extends HttpServlet {

    private AnnotationService annotationService = AutoSpringContext.getBean("annotationService");


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer =resp.getWriter();
        writer.write(annotationService.getMessage());
    }
}
