package com.yesbuter.demo.controller;

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
    public String searchAccount() {
        return this.accountService.searchAccount();
    }
}
