package com.example.demo.myThread;

public class CheckTicket extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
        }
    }
}
