package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import javax.imageio.IIOException;
import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *CustomerService ��Ԫ����
 *
 */
public class CustomerServiceTest {
     private final CustomerService customerService;
     
     public CustomerServiceTest(){
         customerService = new CustomerService();
     }

     @Before
     public void init(){
         String file = "sql/customer_init.sql";
         DatabaseHelper.executeSqlFile(file);
//         InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
//         BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//         String sql;
//         try{
//             while ((sql=reader.readLine()) != null){
//                 DatabaseHelper.executeUpdate(sql);
//             }
//         }catch (IOException e){
//
//         }
     }


     @Test
     public void getCustomerListTest() throws Exception{
         List<Customer> customerList = customerService.getCustomerList();
         System.out.println("customer_list" + customerList.toArray().toString());
         Assert.assertEquals(2,customerList.size());
     }

     @Test
     public void getCustomerTest() throws Exception{
         long id = 1;
         Customer customer = customerService.getCustomer(id);
         Assert.assertNotNull(customer);
     }

     @Test
     public void createCustomerTest() throws Exception{
         Map<String, Object> fieldMap = new HashMap<String, Object>();
         fieldMap.put("name","customer100");
         fieldMap.put("contact","John");
         fieldMap.put("telephone","1351232456");
         boolean result = customerService.createCustomer(fieldMap);
         Assert.assertTrue(result);
     }

     @Test
     public void updateCustomerTest() throws Exception{
         long id = 1;
         Map<String, Object> fieldMap = new HashMap<String, Object>();
         fieldMap.put("contact","Eric");
         boolean result = customerService.updateCustomer(id,fieldMap);
         System.out.println("updateResult :" + String.valueOf(result));

         Assert.assertTrue(result);
     }

     @Test
     public void deleteCustomerTest() throws Exception{
         long id = 1;
         boolean result = customerService.deleteCustomer(id);
         Assert.assertTrue(result);
     }


}
