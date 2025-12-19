package multithreading.OperatingSystem_2.ProducerConsumerSemphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Queue<Shirt> store ;
    private int maxSizeOfStore ;
    private String name ;

    private Semaphore semaForProducer ;
    private Semaphore semaForConsumer ;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name,Semaphore semaForProducer,
                    Semaphore semaForConsumer){
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaForProducer = semaForProducer ;
        this.semaForConsumer = semaForConsumer ;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaForProducer.acquire();
                store.add(new Shirt());
                System.out.println(name + " produced. Left Shirt count =" + store.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaForConsumer.release();
        }
    }
}
