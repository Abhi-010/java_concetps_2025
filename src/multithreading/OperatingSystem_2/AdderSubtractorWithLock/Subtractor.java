package multithreading.OperatingSystem_2.AdderSubtractorWithLock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    private Count count ;
    private Lock lockForCount;

    public Subtractor(Count count, Lock lockForCount){

        this.count = count;
        this.lockForCount = lockForCount;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <=100 ;i++){
            lockForCount.lock();
            System.out.println("Subtractor has lock " + i);
            int currentValue = count.getValue();

            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println("Something went wrong");
            }

            int nextValue = currentValue - i;

            count.setValue(nextValue);
            System.out.println("Subtractor has unlock " + i);
            lockForCount.lock();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Something wrong happened");
            }
        }

    }
}
