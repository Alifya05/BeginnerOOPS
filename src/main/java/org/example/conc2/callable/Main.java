package org.example.conc2.callable;

import java.util.concurrent.*;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        RandomNumberGenerator r = new RandomNumberGenerator();
        Future<Integer> future = es.submit(r);
        System.out.println("Manager is doing his own task");
        int n = future.get(5, TimeUnit.SECONDS);

        System.out.println(n);

        es.shutdown();



    }
}
