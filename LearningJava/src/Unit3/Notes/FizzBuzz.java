package Unit3.Notes;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How far to count?");
        int howFar = Integer.parseInt(input.nextLine());
        while (howFar < 1) {
            System.out.printf("Not a valid number, please try again.");
            howFar = Integer.parseInt(input.nextLine());
        }

        String output;
        for (int myLoop = 1; myLoop <= howFar; myLoop++) {
            output = "";
            if (myLoop % 3 == 0) {
                output += "Fizz";
            }
            if (myLoop % 5 == 0) {
                output += "Buzz";
            }
            if (output.equals("")) {
                System.out.println(myLoop);
            } else {
                System.out.println(output);
            }
        }
    }
}
