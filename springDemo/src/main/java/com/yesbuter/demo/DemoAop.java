package com.yesbuter.demo;

import com.yesbuter.demo.service.AccountService;
import com.yesbuter.demo.util.MyEnum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.sql.SQLOutput;


public class DemoAop {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // AccountService accountService = (AccountService) context.getBean("accountService");
        //accountService.searchAccount();
        System.out.println(MyEnum.monday.getKey());
        System.out.println(MyEnum.monday.getValue());
        BigDecimal bigDecimal = new BigDecimal("123456.789123");
        bigDecimal.setScale(4,BigDecimal.ROUND_HALF_DOWN);
    }
}
