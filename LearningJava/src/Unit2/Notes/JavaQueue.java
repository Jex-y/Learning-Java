package Unit2.Notes;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        priorityQueue();
    }

    static void queue() {
        Queue<String> myQueue= new LinkedList<>();

        // To enforce a fixed size you would define a variable for the maximum size and then check if there is enough
        // space to add the item.

        myQueue.add("Bareny");
        myQueue.add("Wilma");
        myQueue.add("Betty");
        myQueue.add("Fred");

        System.out.println("Is the queue empty? " + myQueue.isEmpty());

        System.out.println(myQueue);

        System.out.printf("%s is at the front of the queue\n",myQueue.peek());

        for (Object element: myQueue) {
            String name = (String) element;
            System.out.println(name);
        }

        String next = (String) myQueue.remove();
        System.out.println(myQueue);
    }

    static void priorityQueue() {
        // Priority enforced using comparator
        // https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/
        PriorityQueue<String> myPQueue = new PriorityQueue<>();

        myPQueue.add("Bareny");
        myPQueue.add("Wilma");
        myPQueue.add("Betty");
        myPQueue.add("Fred");

        System.out.println(myPQueue);

        System.out.printf("%s is at the front of the queue \n", myPQueue.peek());

        String next = (String) myPQueue.remove();

        System.out.println("Now the queue contains:");
        for (Object element: myPQueue ) {
            String name = (String) element;
            System.out.println(name);
        }
    }
}
