package kalash.jain.multithreading.synchronize;

public class UpdaterThread extends Thread {
    private final Counter counter;

    public UpdaterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}
