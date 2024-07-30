package kalash.jain.multithreading.threadclass;

public class FirstTask extends Thread {
    @Override
    public void run() {
        //First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n%s * Task complete", Thread.currentThread().getName());
    }
}