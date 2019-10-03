package com.example.demo.taxiDemo;

public interface Car {
    default void run() {
        System.out.println("car run");
    }

     void fastRun();
}
