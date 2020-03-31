package com.yesbuter.demo.controller;

import com.yesbuter.demo.vo.Account;
import com.yesbuter.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountControl {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/search" ,method = RequestMethod.GET)
    public Account searchAccount() {
        String fileName = this.getClass().getResource("/").getPath();
        System.out.println(fileName);
        Account account = this.accountService.searchAccountById();
        return account;
    }

        public static void main(String[] args) {
            String s = "Hello";
            System.out.println(s);
            String o = s.toUpperCase();
            System.out.println(s);
            System.out.println(o);
            Integer i = 10;
            int j = 10;
            Integer k = Integer.valueOf(10);
            int l = i.intValue();
    }
}
