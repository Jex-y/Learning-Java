package Unit5.Hackerrank;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] secret = input.nextLine().toCharArray();
        boolean done = false;
        int guesses = 0;
        while(!done) {
            System.out.println("Enter your guess");
            char [] guess = input.nextLine().toCharArray();
            boolean [] correct = new boolean[4];
            boolean none = true;
            boolean all = true;
            for (int index = 0; index < 4; index++) {
                if (guess[index] == secret[index]) {
                    correct[index] = true;
                    none = false;
                } else {
                    correct[index] = false;
                    all = false;
                }
            }
            if (none) {
                System.out.println("No correct guesses");
            }
            else if (all) {
                System.out.println("You have guessed all colours correctly");
                done = true;
            }
            else {
                System.out.println("You have guessed answer colours correctly in positions");
                for (int index = 0; index < 4; index++) {
                    if (correct[index]) {
                        System.out.printf("%d\n",index);
                    }
                }
            }
            guesses ++;
            if (guesses == 5) {
                System.out.println("You are out of turns");
                done = true;
            }
        }

    }
}
