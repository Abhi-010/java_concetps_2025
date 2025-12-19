package multithreading.OperatingSystem_2.AdderSubtractorAtomicInteger;

public class Subtractor implements Runnable {

    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            count.getValue().getAndAdd(-i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
