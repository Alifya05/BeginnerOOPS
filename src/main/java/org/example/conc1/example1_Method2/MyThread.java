package org.example.conc1.example1_Method2;

public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread is running.The thread name is :"
        + Thread.currentThread().getName());
    }
}
