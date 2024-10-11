package org.example.conc1.example2;

public class Main {
    public static void main(String[] args) {
        OddPrinter odd = new OddPrinter();
        Thread even = new Thread(new EvenPrinter());
        odd.start();
        even.start();
        System.out.println("Thread name is :"+Thread.currentThread().getName());
    }
}
