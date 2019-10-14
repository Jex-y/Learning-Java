package Hackerrank.MoreAboutStrings;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a code");
        String code = input.nextLine();

        System.out.println("Enter a letter");
        char chr = input.nextLine().charAt(0);

        int index = -1;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == chr) {
                index = i;
            }
        }

        if (index != -1) {
            System.out.printf("Found %s at index %d",chr,index);
        } else {
            System.out.printf("%s was not found in the code",chr);
        }
    }
}
