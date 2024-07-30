package kalash.jain.multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        //First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* Task complete");
        //Second task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ Task complete");
        //Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task complete");

        long endTime = System.currentTimeMillis();
        System.out.printf("\nTotal time taken: %d", (endTime - startTime));
    }
}