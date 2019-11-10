package com.example.demo.beanFactoryDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.Class.forName;

public class BeanFactory {
    private static Properties properties;

    static {
        properties = new Properties();
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    public static Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object bean;
        String beanPath = properties.getProperty(beanName);
        bean = forName(beanPath).newInstance();
        return bean;
    }
}
