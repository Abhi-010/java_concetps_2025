package multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}