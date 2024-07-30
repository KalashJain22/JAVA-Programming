package kalash.jain.multithreading.threadclass;

public class ExtendingThread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting first thread");
        t1.start();
        System.out.println("\nStarting second thread");
        t2.start();
        System.out.
        println("\nStarting third thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%sTotal time taken: %d",  Thread.currentThread().getName(), (endTime - startTime));
    }
}