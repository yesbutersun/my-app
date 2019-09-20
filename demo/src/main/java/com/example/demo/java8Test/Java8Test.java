package com.example.demo.java8Test;

import java.util.Optional;

public class Java8Test {

    public static void main(String[] args) {

        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional<Integer> optional1 = Optional.ofNullable(value1);
        Optional<Integer> optional2 = Optional.ofNullable(value2);
        //System.out.println(optional1);
        System.out.println("******************");
        System.out.println(Optional.of(value2).get());
        System.out.println("******************");
        Optional.ofNullable(value1).ifPresent(System.out::println);
    }
}
