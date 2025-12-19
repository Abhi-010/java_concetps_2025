package multithreading.OperatingSystem_2.PrintNumner.method2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //Print Numbers
        Executor executor = Executors.newCachedThreadPool();
        for(int i = 1 ;i <= 100 ; i++){
            if(i == 50){
                System.out.println("Wait");
            }
           PrintNumber printNumber = new PrintNumber(i);
           executor.execute(printNumber);
        }
    }
}
