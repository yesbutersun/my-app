package com.example.demo.iString;

public class iStringDemo {
    static StringBuffer result = new StringBuffer();

    public static void main(String[] args) {
        iStringFun("123456789");
        System.out.println(result);
    }

    private static void iStringFun(String str) {
        if (str.length() == 1) {
            result.append(str);
            System.out.println(str);
        } else {
            iStringFun(str.substring(1));
            result.append(str.substring(0,1));
            System.out.println(str.substring(0,1));
        }
    }
}
