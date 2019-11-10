package com.yesbuter.demo.service.impl;

import com.yesbuter.demo.service.ProducerService;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Override
    public void saleProduct(float money) {
        System.out.println("销售商品，并拿到钱" + money);
    }

    @Override
    public void afterService(float money) {
        System.out.println("售后服务" + money);
    }
}
