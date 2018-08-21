package org.smart4j.chapter2.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

/**
 *创建用户
 *
 */


@WebServlet("/customer_create")
public class CustomerCreatServlet extends HttpServlet {
    /**
     *进入创建客户端界面
     *
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

    }

    /**
     *处理创建客户请求
     *
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

    }
}
