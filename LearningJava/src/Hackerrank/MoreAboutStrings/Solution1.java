package Hackerrank.MoreAboutStrings;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String vowels = "aeiou";
        System.out.println("Enter a phrase");
        String phrase = input.nextLine();
        int total = 0;
        for (int i = 0; i < phrase.length() ; i++) {
            if (vowels.indexOf(phrase.toLowerCase().charAt(i)) >= 0) {
                total ++;
            }
        }
        System.out.printf("There are %d vowels in %s\n",total,phrase);
    }
}
