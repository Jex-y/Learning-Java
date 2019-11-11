package Unit2.Notes;

import javax.swing.plaf.RootPaneUI;
import java.util.ArrayList;

public class Queue<datatype> {
    private ArrayList<datatype> data;
    private int startPointer = 0;
    private int backPointer = 0;
    private int size;
    private String type;

    Queue(int size) {
        this(size, "Linear");
    }

    Queue(int size, String type) {
        this.data = new ArrayList<datatype>();
        this.size = size;
        this.type = type;
    }

    public void put(datatype value){
        if (backPointer < this.size) {
            this.data.add(value);
            backPointer++;
        } else {
            System.err.println("End of queue reached, cannot put more data");
        }
    }

    public datatype pop(){
        datatype result;
        if (startPointer < backPointer) {
            result = this.data.get(startPointer);
            this.data.set(startPointer,null);
            startPointer++;
        } else {
            result = null;
            System.err.println("No more data left in queue to pop");
        }
        return result;
    }

    public String toString() {
        String output = "[ ";
        boolean first = true;
        datatype value;
        for ( int i = 0; i < this.size; i++ ) {
            if ( i < backPointer ){
                value = this.data.get(i);
                if (value != null) {
                    output += String.valueOf(value);
                }
                else {
                    output += "#";
                }
            }
            else {
                output += "#";
            }
            if ( i != this.size - 1 ) { output += ", "; }
        }
        output += " ]\nStart Pointer: ";
        output += String.valueOf(this.startPointer);
        output += "\tBack Pointer: ";
        output += String.valueOf(this.backPointer);
        return output;
    }

    public static void main(String[] args) {
        Queue x = new Queue<Integer>(3);
        x.put(1);
        x.put(2);
        x.put(3);
        System.out.println(x.pop());
        System.out.println(x.toString());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.toString());
        System.out.println(x.pop());
    }
}
