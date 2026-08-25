package dsa.utility.DSA_Utility_Collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class array_deque_as_queue {
    public static void main(String[] args) {
        // Instantiate ArrayDeque as a Queue
        Queue<String> taskQueue = new ArrayDeque<>();

        // 1. Enqueue operations (Adds to tail)
        taskQueue.offer("Download Update");
        taskQueue.offer("Extract Files");
        taskQueue.offer("Install App");

        // 2. Peek operation (Looks at head)
        System.out.println("Current Task: " + taskQueue.peek()); // Output: Download Update

        // 3. Dequeue operations (Removes from head)
        System.out.println("Executing: " + taskQueue.poll()); // Output: Download Update
        System.out.println("Executing: " + taskQueue.poll()); // Output: Extract Files

        // 4. Null safety check
        try {
            taskQueue.offer(null); // This will crash
        } catch (NullPointerException e) {
            System.out.println("Error: ArrayDeque cannot store null values!");
        }
    }
}
