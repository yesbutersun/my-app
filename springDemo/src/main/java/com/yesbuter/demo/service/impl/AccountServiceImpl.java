package com.yesbuter.demo.service.impl;

import com.yesbuter.demo.vo.Account;
import com.yesbuter.demo.dao.AccountDao;
import com.yesbuter.demo.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private Logger logger = LoggerFactory.getLogger(com.yesbuter.demo.service.impl.AccountServiceImpl.class);

    @Autowired
    AccountDao accountDao;

    @Override
    public Account searchAccountById() {
        logger.info("loggerFactor Account running");
        return accountDao.selectAccountById();
    }
}
