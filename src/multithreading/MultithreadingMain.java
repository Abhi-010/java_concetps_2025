package multithreading;

public class MultithreadingMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        // Case 1: This starts a new thread
        t1.start();  // Output: Running in: Thread-0 (or similar)

        // Case 2: This runs like a normal method
        t1.run();    // Output: Running in: main
    }
}
