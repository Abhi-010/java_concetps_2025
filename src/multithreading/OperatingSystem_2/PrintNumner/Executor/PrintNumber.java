package multithreading.OperatingSystem_2.PrintNumner.Executor;

public class PrintNumber implements Runnable {

    private int numberToPrint ;

    PrintNumber(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(this.numberToPrint + " Printed via Thread : [" + Thread.currentThread().getName() + "]");
    }
}
