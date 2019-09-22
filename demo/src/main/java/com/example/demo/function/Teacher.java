package com.example.demo.function;

import java.io.Serializable;

public class Teacher<T> implements Serializable {
    private static final long serialVersionUID = 44L;
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + name +
                '}';
    }
}
