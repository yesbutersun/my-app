package com.example.demo.function;

import java.util.Arrays;

public class MyPrint {

    public String name ;

    public final <T> void myPrint(T... t) {
        Arrays.stream(t).forEach(item -> System.out.println(item));

    }
}
