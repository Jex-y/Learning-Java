package Unit2.Notes;

import java.util.ArrayList;

public class Stack<datatype> {
    private int size = 0;
    private ArrayList<datatype> data;
    private int MAXSIZE;

    Stack(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        data = new ArrayList<datatype>();
        for (int i = 0; i < MAXSIZE; i++) {
            data.add(null);
        }
    }

    public void push(datatype item) {
        if (size < MAXSIZE) {
            data.set(size, item);
            size++;
        } else {
            System.err.println("Error: Stack full, cannot push item");
        }
    }

    public datatype pop() {
        datatype result = null;
        if (size > 0) {
            size--;
            result = data.get(size);
            data.set(size, null);
        } else {
            System.err.println("Error: Stack is empty, cannot pop item");
        }
        return result;
    }

    public datatype peek() {
        datatype result = null;
        if (size > 0) {
            result = data.get(size - 1);
        } else {
            System.err.println("Error: Stack is empty, cannot peek item");
        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAXSIZE;
    }

    public String toString() {
        String output = "[ ";
        boolean first = true;
        datatype value;
        for (int i = 0; i < MAXSIZE; i++) {
            if (i < size) {
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
        output += "]\nMax Size: ";
        output += String.valueOf(MAXSIZE);
        return output;
    }
}
