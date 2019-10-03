package com.example.demo.taxiDemo;

public class TaxiDemo {
    public static void main(String[] args) {
    /*    Driver driver = new Driver();
        driver.fastRun();
        driver.run();*/
        TaxiDemo taxiDemo = new TaxiDemo();
       /* taxiDemo.rideBike(()->{
            System.out.println("ride bike");
        });*/
          taxiDemo.rideBike(System.out::println
        );

    }

    private void rideBike(Bike bike) {
        bike.ride();
    }

    public void calculate() {
    }
}
