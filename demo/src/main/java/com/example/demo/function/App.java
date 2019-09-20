package com.example.demo.function;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Teacher<Integer> t1 = new Teacher<Integer>();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        t1.setName(111);
        t2.setName("world");
        t3.setName(33.3);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

        System.out.println("++++++++++++++++++++");
        Student s1 = new Student();
        s1.show(222);
        s1.show("world Hello");


        System.out.println("==================================>");

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.Jumping();

        ((Jump) () -> System.out.println("000000")).Jumping();

        StringBuffer sb = new StringBuffer("hello");
        sb.append("java");
        System.out.println(sb);

        System.out.println("+++++++++++++++");

        MyPrint myPrint = new MyPrint();
        myPrint.myPrint("shfihfis","nsdknksd","dkdkdkkd","dsdffffff");
    }
}
