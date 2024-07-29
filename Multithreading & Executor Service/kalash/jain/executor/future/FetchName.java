package kalash.jain.executor.future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;
 
    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("Getting full name of %s server\n", name);
        Thread.sleep(4000);
        return name + " Bhartiye";
    }
    
}