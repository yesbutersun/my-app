package com.example.demo.myThrowable;

import java.util.ArrayList;

public class ThrowableDemo {
    public static void main(String[] args) throws MyException {
        ArrayList<String> list = new <String>ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        if (true) {
        throw new MyException();
        }

    }
}
