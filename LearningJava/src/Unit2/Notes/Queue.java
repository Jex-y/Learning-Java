package Unit2.Notes;

import java.util.ArrayList;

public class Queue<dataType> {
    private ArrayList<dataType> data;
    private int startPointer = 0;
    private int backPointer = 0;
    private int size = 0;
    private int MAXSIZE;
    private String type;

    Queue(int MAXSIZE) {
        this(MAXSIZE, "linear");
    }

    Queue(int MAXSIZE, String type) {
        boolean valid = false;
        String[] validTypes = {"linear", "circular"};
        for (int i = 0; i < validTypes.length; i++) {
            if (type.equals(validTypes[i])) {
                valid = true;
            }
        }
        if (!valid) {
            System.err.println("Error: Invalid queue type, choose from: " + validTypes.toString());
            System.exit(1);
        }
        data = new ArrayList<dataType>();
        for (int i = 0; i < MAXSIZE; i++) {
            data.add(null);
        }
        this.MAXSIZE = MAXSIZE;
        this.type = type;
    }

    public static void main(String[] args) {
        Queue<Integer> x = new Queue<Integer>(3, "circular");
        x.put(1);
        x.put(2);
        x.put(3);
        System.out.println(x.pop());
        x.put(4);
        System.out.println(x.toString());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.toString());
        System.out.println(x.pop());
    }

    public void put(dataType value) {
        if (type.equals("linear")) {
            if (backPointer < MAXSIZE) {
                data.add(value);
                backPointer++;
                size++;
            } else {
                System.err.println("Error: queue full, cannot put");
            }
        } else if (type.equals("circular")) {
            if (size < MAXSIZE) {
                backPointer %= MAXSIZE;
                data.set(backPointer, value);
                backPointer++;
                size++;
            } else {
                System.err.println("Error: queue full, cannot put");
            }
        }
    }

    public dataType pop() {
        dataType result = null;
        if (type.equals("linear")) {
            if (startPointer < backPointer) {
                result = data.get(startPointer);
                data.set(startPointer, null);
                startPointer++;
                size--;
            } else {
                System.err.println("Error: Queue empty, cannot pop");
            }
        } else if (type.equals("circular")) {
            if (size != 0) {
                startPointer %= MAXSIZE;
                result = data.get(startPointer);
                data.set(startPointer, null);
                startPointer++;
                size--;
            } else {
                System.err.println("Error: Queue empty, cannot pop");
            }
        }
        return result;
    }

    public dataType peek() {
        dataType result = null;
        if (size != 0) {
            result = data.get(startPointer);
        } else {
            System.err.println("Error: Queue empty, cannot peek");
        }
        return result;
    }

    public boolean isFull() {
        return size == MAXSIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String output = "[ ";
        boolean first = true;
        dataType value;
        for (int i = 0; i < MAXSIZE; i++) {
            if (i < backPointer) {
                value = data.get(i);
                if (value != null) {
                    output += String.valueOf(value);
                } else {
                    output += "#";
                }
            } else {
                output += "#";
            }
            if (i != MAXSIZE - 1) {
                output += ", ";
            }
        }
        output += " ]\nStart Pointer: ";
        output += String.valueOf(startPointer);
        output += "\tBack Pointer: ";
        output += String.valueOf(backPointer);
        output += "\tMax Size: ";
        output += String.valueOf(MAXSIZE);
        output += "\tType: ";
        output += type;
        return output;
    }
}
