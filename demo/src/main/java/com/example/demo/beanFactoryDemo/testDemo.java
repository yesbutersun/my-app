package com.example.demo.beanFactoryDemo;

import com.example.demo.service.AccountService;

public class testDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        System.out.println(accountService);
    }
}
