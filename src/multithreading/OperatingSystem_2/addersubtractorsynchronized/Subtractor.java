package multithreading.OperatingSystem_2.addersubtractorsynchronized;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.decrement();
        }
    }
}
