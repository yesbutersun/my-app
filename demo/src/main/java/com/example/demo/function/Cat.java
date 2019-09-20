package com.example.demo.function;

public class Cat extends Animal implements Jump{
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }


    @Override
    public void Jumping() {
        System.out.println("cat jump");
    }
}
