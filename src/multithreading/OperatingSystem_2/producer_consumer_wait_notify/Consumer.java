package multithreading.OperatingSystem_2.producer_consumer_wait_notify;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Shirt> store ;
    private String name ;

    public Consumer(Queue<Shirt> store, String name){
        this.store = store;
        this.name = name ;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store){

                while(store.isEmpty()){
                    System.out.println("Store is empty, Consumer waiting");
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(!store.isEmpty()){
                    store.remove();
                    System.out.println(name + " consumed. Left Shirt count =" + store.size());
                    store.notifyAll();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
