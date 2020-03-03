package Unit2.Notes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        priorityQueue();
    }

    static void queue() {
        Queue<String> baseQueue = new LinkedList<>();
        staticQueue myQueue = new staticQueue(baseQueue, 4);
        final int MAX_SIZE = 4;
        int size = 0;

        // To enforce a fixed size you would define a variable for the maximum size and then check if there is enough
        // space to add the item.

        myQueue.add("Bareny");
        myQueue.add("Wilma");
        myQueue.add("Betty");
        myQueue.add("Fred");

        System.out.println("Is the queue empty? " + myQueue.isEmpty());

        System.out.println(myQueue);

        System.out.printf("%s is at the front of the queue\n", myQueue.peek());

        for (Object element : myQueue) {
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
        for (Object element : myPQueue) {
            String name = (String) element;
            System.out.println(name);
        }
    }
}

class staticQueue implements Iterable<Object> {
    // Should probably use inheritance but a wrapper is easier.
    Queue queue;
    final int MAX_SIZE;
    int size = 0;

    staticQueue(Queue queue, int MAX_SIZE) {
        this.queue = queue;
        this.MAX_SIZE = MAX_SIZE;
    }

    void add(Object item) {
        if (size < MAX_SIZE) {
            queue.add(item);
            size ++;
        } else {
            System.err.println("Error: Cannot add item, queue full");
        }
    }

    Object remove() {
        Object result;
        if (size > 0) {
            result = queue.remove();
            size --;
        } else {
            System.err.println("Error: Queue is empty, cannot remove item");
            result = null;
        }
        return result;
    }

    boolean isEmpty() { return queue.isEmpty(); }

    Object peek() { return queue.peek(); }

    public String toString() {
        return String.format("%s, size: %d/%d",queue.toString(), size, MAX_SIZE);
    }

    @Override
    public Iterator<Object> iterator() {
        return queue.iterator();
    }
}
