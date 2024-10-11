package org.example.conc1.example1_Method2;

public class Main {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
         Thread thread = new Thread(mythread);
            thread.run();

        System.out.println("Main thread is running.Here is the proof : "+Thread.currentThread().getName());
    }
}
