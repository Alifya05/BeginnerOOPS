package org.example.conc2.adder_subtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Count count = new Count();
        Adder a = new Adder(count);
        Subtractor s = new Subtractor(count);

        es.execute(a);
        es.execute(s);

        System.out.println("Final value: "+count.num);

        es.shutdown();

    }
}
