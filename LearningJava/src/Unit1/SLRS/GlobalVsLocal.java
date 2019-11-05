package Unit1.SLRS;

public class GlobalVsLocal {
    private static int global = 1;
    public static void main(String[] args) {
        int local = 2;
        System.out.printf("Global variable global is %d! It is in the scope of the whole class\n",global);
        System.out.printf("Local variable local is %d! It can only be used in the main method\n",local);

        obj myObj1 = new obj();
        obj myObj2 = new obj();
        obj myObj3 = new obj();
    }
}

class obj{
    private static int count = 0;
    public obj() {
        count++;
        System.out.printf("Object created. There are now %d objects!\n",count);
    }
}

