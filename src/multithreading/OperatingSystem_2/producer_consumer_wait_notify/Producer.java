package multithreading.OperatingSystem_2.producer_consumer_wait_notify;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue<Shirt> store ;
    private int maxSizeOfStore ;
    private String name ;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name){
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store){

                while(store.size() == maxSizeOfStore){
                    System.out.println("Store is full : Producer waiting");
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(store.size() < maxSizeOfStore){
                    store.add(new Shirt());
                    System.out.println(name + " produced. Left Shirt count =" + store.size());
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
