package org.example.conc2.adder_subtractor;

public class Adder implements Runnable {
    Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            count.num++;
        }
    }
}
