package multithreading.OperatingSystem_2.addersubtractorsynchronized;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}

/*

Every object has an intrinsic (monitor) lock.
When a thread enters a synchronized block or method:
It acquires the lock of that object
Other threads trying to acquire the same object’s lock are BLOCKED
They do not busy wait

Object-level lock = lock tied to a specific object instance.
synchronized makes threads block, not spin.
It is a good synchronization solution (no busy waiting).

 */

