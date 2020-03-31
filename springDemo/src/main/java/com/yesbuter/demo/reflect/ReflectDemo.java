package com.yesbuter.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //1
        //Class class1 = new Class();

        //2
        Class class2 = Class.forName("com.yesbuter.demo.reflect.Student");

        //3
        String str = "hello world";
        Class class3 = str.getClass();

        Field name = class2.getField("name");
        Field grade = class2.getDeclaredField("grade");
        Field age = class2.getDeclaredField("score");

        Method method = class2.getMethod("setScore", Integer.class);
        Integer temp = (Integer) method.invoke(new Student(),60);
        System.out.println(temp);

    }
}

class Person {
    public String name;
    private Integer age;
}

class Student extends Person {
    private String grade;

    public Integer score;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getScore() {
        return score;
    }

    public Integer setScore(Integer score) {
        this.score = score;
        return score;
    }


}
