package Unit1.Notes;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         *   ----------------------------------------------------------------------------------------------------
         *                                          Widening Casting
         *  ----------------------------------------------------------------------------------------------------
         */

        // Widening casting is done automatically.
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        /*
         *   ----------------------------------------------------------------------------------------------------
         *                                          Narrowing Casting
         *  ----------------------------------------------------------------------------------------------------
         */

        // Narrowing casting must be done manually.

        myDouble = 3.141;
        int myInt2 = (int)myDouble;

        System.out.println(myDouble); // Outputs 3.141
        System.out.println(myInt2); // Outputs 3




    }
}
