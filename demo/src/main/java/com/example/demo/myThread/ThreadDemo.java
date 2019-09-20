package com.example.demo.myThread;

public class ThreadDemo {
    public static void main(String[] args) {
     /*   CheckTicket checkTicket1 = new CheckTicket();
        CheckTicket checkTicket2 = new CheckTicket();
        checkTicket1.setName("yesbuter");
        checkTicket2.setName("nobuter");
        checkTicket1.setPriority(1);
        checkTicket2.setPriority(9);
        checkTicket1.start();
        checkTicket2.start();*/

        SellTicket sellTicket = new SellTicket();
        Thread thread1 = new Thread(sellTicket);
        Thread thread2 = new Thread(sellTicket);
        Thread thread3 = new Thread(sellTicket);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
