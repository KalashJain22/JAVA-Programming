package kalash.jain.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char)i);
            service.submit(task);
        }

        service.shutdown();
        System.out.println("\n************************1\n");
        
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n************************2\n");
            service.shutdownNow();
        }
    }
}