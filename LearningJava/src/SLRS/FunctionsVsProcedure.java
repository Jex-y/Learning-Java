package SLRS;

public class FunctionsVsProcedure {
    public static void main(String[] args) {
        int x = 1;
        x = function(x);
        procedure(x);

    }
    public static int function(int x) {
        System.out.println("Function called!"); // This is a Function
        x++;
        return x;
    }

    public static void procedure(int x) {
        System.out.printf("The number that you entered was %d!\n",x); // This is a procedure
        return;
    }
}
