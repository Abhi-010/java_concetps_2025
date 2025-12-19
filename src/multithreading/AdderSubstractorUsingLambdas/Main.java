package multithreading.AdderSubstractorUsingLambdas;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        String myName = "Naman";


        Callable<Void> adderLambda = () -> {
            for(int i = 0 ; i < 5000 ; i++){
                l.lock();
                v.value+=i;
                l.unlock();
            }
            return null;
        };

        Callable<Void> substractorLambda = () -> {
            for(int i = 0 ; i < 5000 ; i++){
                l.lock();
                v.value-=i;
                l.unlock();
            }
            return null;
        };
        ExecutorService es = Executors.newCachedThreadPool();

        Void v1 = null;

//        Callable<Void> adderLambda = () -> {
//            for (int i = 1; i <= 5000; ++i) {
//                l.lock();
//                v.value += i; // all of the variables of the same scope are already present in the lambda
//
//                l.unlock();
//            }
//            return null;
//        };
//
//
//        // 1. Create a class AnonymizedSubtractorLambda
//        // 2. It will implement the interface Callable<Void>
//        // 3. It will pass all variables being shared with the current scope to the class
//        // 4. It will copy the code inside lambda body into the interface method of that class
//        Callable<Void> subtractorLambda = () -> {
//            for (int i = 1; i <= 5000; ++i) {
//                l.lock();
//                v.value -= i; // all of the variables of the same scope are already present in the lambda
////                l.add(232);
//                l.unlock();
//            }
//            return null;
//        };
//
        Future<Void> adderFuture = es.submit(adderLambda);
        Future<Void> subtractorFuture = es.submit(substractorLambda);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}

// Lambdas: Making ti very easy to create an object
// of a class that implements a functional interface