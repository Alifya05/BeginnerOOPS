package org.example.conc2.callable;

import java.util.Random;
import java.util.concurrent.Callable;


public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("In the new thread");
        Thread.sleep(1000*10);
        int num = random.nextInt();
        System.out.println("Random number generated "+num);

        return num;

    }
}
