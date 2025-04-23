import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LatencyMonitor monitor = new LatencyMonitor();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    double latency = ThreadLocalRandom.current().nextInt(0,Integer.MAX_VALUE);
                    monitor.updateLatency(latency);
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Min latency: " + monitor.getMinLatency());
    }
}
