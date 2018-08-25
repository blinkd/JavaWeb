package org.smart4j.chapter2.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import javax.xml.crypto.Data;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 *customerSerice 类中读取config.properties文件是不合理的 以后很多service类都需要做同样的事情  添加DatabaseHelper 类与方法提供数据库的连接与关闭
 *
 *执行一条sql需要用try..catch 捕捉  效率不高  用DbUtils工具来封装现有的sql方法
 */




/**
 *提供客户端服务控制(JDBC代碼)
 *
 */

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    /**
     *获取客户列表
     *
     */
    public List<Customer> getCustomerList(){

        Connection conn = null;
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);


    }

    /**
     *获取客户
     *
     */
    public Customer getCustomer(long id){
        return null;
    }

    /**
     *创建客户
     *
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     *更新客户
     *
     */
    public boolean updateCustomer(long id,Map<String, Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     *删除客户
     *
     */
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
