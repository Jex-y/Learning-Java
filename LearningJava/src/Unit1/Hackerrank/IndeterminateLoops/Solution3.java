package Unit1.Hackerrank.IndeterminateLoops;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response;

        do {
            System.out.println("Would you like to hear a joke or a pun? (JOKE/PUN)");
            response = input.nextLine();
        } while (!(response.equals("JOKE") || response.equals("PUN")));

        if (response.equals("JOKE")) {
            System.out.println("My friend says to me: \"What rhymes with orange?\" I said: \"No it doesn't!\"");
        } else {
            System.out.println("You're becoming a vegetarian? I think that's a big missed steak.");
        }
    }
}
