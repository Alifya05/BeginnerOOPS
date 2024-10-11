package org.example.conc1.example1_Method1;

public class Main {
    public static void main(String[] args) {

        BasicThread thread = new BasicThread();
        thread.start();
        System.out.println("I am in Main Thread.The name of Thread is "
                +Thread.currentThread().getName());

    }
}
