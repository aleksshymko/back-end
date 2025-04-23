import java.util.concurrent.atomic.AtomicLong;

public class LatencyMonitor {

    private final AtomicLong minLatency = new AtomicLong(Long.MAX_VALUE);

    public void updateLatency(double latency) {
        long currentLatency = (long) latency;

        while (true) {
            if (currentLatency >= getMinLatency()) return;
            else minLatency.compareAndSet(getMinLatency(), currentLatency);
        }
    }

    public long getMinLatency() {
        return minLatency.get();
    }
}
