package org.example.conc1.example2;

public class OddPrinter extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            if(i%2 == 1)
                System.out.println("Thread name is :"+Thread.currentThread().getName()+" Odd thread :"+i);
        }
    }
}
