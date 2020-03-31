package com.yesbuter.demo.dao.impl;

import com.yesbuter.demo.vo.Account;
import com.yesbuter.demo.dao.AccountDao;
import com.yesbuter.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account selectAccountById() {
        return accountMapper.selectAccountById();
    }
}
