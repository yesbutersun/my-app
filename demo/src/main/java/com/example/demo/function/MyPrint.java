package com.example.demo.function;

import java.util.Arrays;

public class MyPrint {

    public String name ;

    @SafeVarargs
    final <T> void myPrint(T... t) {
        Arrays.stream(t).forEach(System.out::println);

    }
}
