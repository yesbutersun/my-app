package com.yesbuter.demo.mapper;

import com.yesbuter.demo.vo.Account;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountMapper {

    Account selectAccountById();
}
