package org.example.conc1.example1_Method1;

public class BasicThread extends Thread{
    public void run(){
        System.out.println("I am in Basic Thread.The name of Thread is "
                +Thread.currentThread().getName());
    }
}
