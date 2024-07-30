package kalash.jain.multithreading;

import kalash.jain.multithreading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n\nThread one started\n\n");
        Thread t2 = new Thread(p2);
        t2.start(); 
        System.out.println("\n\nThread two started\n\n");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n\nThread three started\n\n");
        
        long endTime = System.currentTimeMillis();
        System.out.printf("\n\n%s Total time taken: %d\n\n",  Thread.currentThread().getName(), (endTime - startTime));
    }
}