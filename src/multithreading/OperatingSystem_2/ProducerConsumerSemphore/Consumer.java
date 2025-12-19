package multithreading.OperatingSystem_2.ProducerConsumerSemphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Queue<Shirt> store ;
    private String name ;

    private Semaphore semaForProducer ;
    private Semaphore semaForConsumer ;

    public Consumer(Queue<Shirt> store, String name, Semaphore semaForProducer
    ,Semaphore semaForConsumer){
        this.store = store;
        this.name = name ;
        this.semaForProducer = semaForProducer ;
        this.semaForConsumer = semaForConsumer ;
    }
    @Override
    public void run() {
        while(true){
            try {
                semaForConsumer.acquire();
                store.remove();
                System.out.println(name + " consumed. Left Shirt count =" + store.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaForProducer.release();
        }
    }
}
