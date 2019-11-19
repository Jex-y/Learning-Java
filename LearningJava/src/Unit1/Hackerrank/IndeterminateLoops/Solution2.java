package Unit1.Hackerrank.IndeterminateLoops;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        final String secret = "giraffe";
        String comp;
        boolean done = false;
        Scanner input = new Scanner(System.in);

        while (!done) {
            System.out.println("Guess the secret word");
            comp = input.nextLine();

            if (comp.equals(secret)) {
                System.out.println("You guessed it correctly");
                done = true;
            } else {
                System.out.println("That's wrong");
            }
        }

    }
}
