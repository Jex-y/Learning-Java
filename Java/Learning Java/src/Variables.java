public class Variables {
    public static void main(String [] args) {

        /*
        *----------------------------------------------------------------------------------------------------
        *                                               Variables
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
        String myText = "Hello";

        /*
         *----------------------------------------------------------------------------------------------------
 *                                               Displaying Variables
         * ----------------------------------------------------------------------------------------------------
         */

        // System.out.println() is often used to display variables
        // + operator can be used to concatenate strings

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

    }
}
