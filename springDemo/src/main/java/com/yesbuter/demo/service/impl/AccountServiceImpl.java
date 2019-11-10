package com.yesbuter.demo.service.impl;

import com.yesbuter.demo.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public String searchAccount() {
        System.out.println("SearchAccount running");
        return "SearchAccount running";
    }
}
