package multithreading.OperatingSystem_2;

public class MultithreadingMain {
    public static void main(String[] args) {
        PrintHelloWorld printHelloWorld = new PrintHelloWorld() ;

        printHelloWorld.run();

        Thread thread = new Thread(printHelloWorld);
        thread.start(); // Output: Running in: Thread-0 (or similar)
        thread.run(); // Output: Running in: main

        // print number in different threads :

        for(int i = 0 ; i < 100 ;i++){
            PrintNumber printNumber = new PrintNumber(i);
            Thread t1 = new Thread(printNumber);
            t1.start();
        }


    }
}
