package com.example.demo.IOStream;

import com.example.demo.function.Teacher;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectStream objectStream = new ObjectStream();
        //objectStream.writeObject();
        objectStream.readObject();

    }

    private void writeObject() throws IOException {
        Teacher teacher = new Teacher();
        teacher.setName("yesbuter");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("123.txt"));
        objectOutputStream.writeObject(teacher);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    private void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("123.txt"));
        Object object = objectInputStream.readObject();
        Teacher teacher1 = (Teacher) object;
        System.out.println("@@@@" + teacher1);
        objectInputStream.close();
    }
}
