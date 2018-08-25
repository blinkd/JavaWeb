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
 *customerSerice ���ж�ȡconfig.properties�ļ��ǲ������ �Ժ�ܶ�service�඼��Ҫ��ͬ��������  ���DatabaseHelper ���뷽���ṩ���ݿ��������ر�
 *
 *ִ��һ��sql��Ҫ��try..catch ��׽  Ч�ʲ���  ��DbUtils��������װ���е�sql����
 */




/**
 *�ṩ�ͻ��˷������(JDBC���a)
 *
 */

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    /**
     *��ȡ�ͻ��б�
     *
     */
    public List<Customer> getCustomerList(){

        Connection conn = null;
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);


    }

    /**
     *��ȡ�ͻ�
     *
     */
    public Customer getCustomer(long id){
        return null;
    }

    /**
     *�����ͻ�
     *
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     *���¿ͻ�
     *
     */
    public boolean updateCustomer(long id,Map<String, Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     *ɾ���ͻ�
     *
     */
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
