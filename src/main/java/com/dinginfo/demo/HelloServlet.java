package com.dinginfo.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * **************************************************************
 * <p>
 *
 * @DESCRIPTION :
 * @AUTHOR : ding@dinginfo.com
 * @DATE :2017/8/11 23:28
 * </p>
 * ***************************************************************
 */
@WebServlet(name = "HelloServlet", value = "/hi")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.write("Hello...");
    }
}
