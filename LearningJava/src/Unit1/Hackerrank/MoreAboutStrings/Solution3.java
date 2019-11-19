package Unit1.Hackerrank.MoreAboutStrings;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase");
        String phrase = input.nextLine();

        System.out.println("What letter do you want to find?");
        char chr = input.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == chr) {
                count += 1;
            }
        }

        if (count > 0) {
            System.out.printf("Found %d", count);
        } else {
            System.out.printf("Did not find %s", chr);
        }
    }
}
