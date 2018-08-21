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
 *编辑用户信息
 *
 */


@WebServlet("/customer_edit?id={id}")
public class CustomerEditServlet extends HttpServlet {
    /**
     *进入编辑客户界面
     *
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

    }

    /**
     *处理编辑用户
     *
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

    }
}
