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
 *ɾ���û�
 *
 */


@WebServlet("/customer_delete?id={id}")
public class CustomerDeleteServlet extends HttpServlet {
    /**
     *���봴���ͻ��˽���
     *
     */

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{

    }

}
