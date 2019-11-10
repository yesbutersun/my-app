package com.yesbuter.demo;

import com.yesbuter.demo.service.ProducerService;
import com.yesbuter.demo.service.impl.ProducerServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoInvoke {
    public static void main(String[] args) {
        ProducerServiceImpl producerServiceImpl = new ProducerServiceImpl();
        ProducerService producerService = (ProducerService) Proxy.newProxyInstance(ProducerServiceImpl.class.getClassLoader(),
                ProducerServiceImpl.class.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        float money = (float) args[0] * 0.8f;
                     /*   if ("saleProduct".equals(method.getName())) {
                            return method.invoke(producerServiceImpl, money);
                        } else {
                            return null;
                        }*/
                        if ("afterService".equals(method.getName())) {
                            return method.invoke(producerServiceImpl, money);
                        }else {
                            return null;
                        }
                    }
                });
        //producerService.saleProduct(10000);
        producerService.afterService(1000);
    }
}
