package com.yesbuter.demo.annotation;

import com.yesbuter.demo.vo.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class Check {
    private final Logger logger = LoggerFactory.getLogger(Check.class);

    public void checkParam(Account account) throws IllegalAccessException {
        Field[] fields = account.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ParamCheck.class)) {
                ParamCheck paramCheck = field.getAnnotation(ParamCheck.class);
                field.setAccessible(true);
                Object object = field.get(account);
                if (object instanceof Integer) {
                    if (((Integer) object).compareTo(new Integer(paramCheck.min())) > 0 && ((Integer) object).compareTo(new Integer(paramCheck.max())) < 0) {
                        System.out.println("success");
                    } else {
                        System.out.println("failed");
                    }
                }
            }

        }
    }
}
