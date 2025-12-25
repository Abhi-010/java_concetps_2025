package multithreading.OperatingSystem_2.addersubtractorsynchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(adder);
        executorService.execute(subtractor);

        System.out.println("Before ShutDown " + count.getValue());
        executorService.shutdown();
        try{
            executorService.awaitTermination(10, TimeUnit.SECONDS);

        }
        catch (Exception e){
            System.out.println("Something wrong happened");
        }
        System.out.println(count.getValue());
    }
}
