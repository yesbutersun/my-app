package com.example.demo.myThread;

public class SellTicket implements Runnable {
    private Integer ticketNum = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (ticketNum >= 0) {
            synchronized (object) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出第" + ticketNum + "张票");
                    ticketNum--;
                }
            }
        }
    }
}
