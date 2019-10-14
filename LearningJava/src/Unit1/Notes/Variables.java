package Unit1.Notes;

public class Variables {
    public static void main(String [] args) {

        /*
        *----------------------------------------------------------------------------------------------------
        *                                               NotesUnit1.Variables
        * ----------------------------------------------------------------------------------------------------
        */

        // General syntax for declaring variables is:
        // type name = value;

        int myNum = 15;
        // or:
        // int myNum;
        // myNum = 15;
        System.out.println( myNum );

        float myFloatNum = 5.99f; // Float litterals must be followed by an 'f'
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "NotesUnit1.Hello";

        /*
         *----------------------------------------------------------------------------------------------------
 *                                               Displaying NotesUnit1.Variables
         * ----------------------------------------------------------------------------------------------------
         */

        // System.out.println() is often used to display variables
        // + operator can be used to concatenate strings

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // + operator can also be used to add real types

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        /*
         *----------------------------------------------------------------------------------------------------
         *                                      Declare Many NotesUnit1.Variables
         * ----------------------------------------------------------------------------------------------------
         */

        // You can easily declare many variables of the same type like this:
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        // All variables must have unique names
    }
}
