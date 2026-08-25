package dsa.utility.DSA_Utility_Collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class array_deque_as_deque {
    public static void main(String[] args) {
        // Use Deque reference instead of Queue
        Deque<Integer> numbers = new ArrayDeque<>();

        // Add to both ends
        numbers.addLast(20);   // Structure: [20]
        numbers.addFirst(10);  // Structure: [10, 20]
        numbers.addLast(30);   // Structure: [10, 20, 30]

        System.out.println("Current Deque: " + numbers); // Output: [10, 20, 30]

        // Peek from both ends
        System.out.println("First element: " + numbers.peekFirst()); // Output: 10
        System.out.println("Last element: " + numbers.peekLast());   // Output: 30

        // Remove from both ends
        System.out.println("Removed from front: " + numbers.pollFirst()); // Output: 10
        System.out.println("Removed from back: " + numbers.pollLast());   // Output: 30

        System.out.println("Remaining Deque: " + numbers); // Output: [20]
    }
}
