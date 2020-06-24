package EOYExam;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word 1: ");
        String word1 = input.nextLine().toUpperCase();

        System.out.print("Enter word 2: ");
        String word2 = input.nextLine().toUpperCase();

        boolean charIsValid = true;
        int word1Index = 0;
        int word2Index;
        while (charIsValid && (word1Index < word1.length())) {
            charIsValid = false;
            word2Index = 0;
            while ((!charIsValid) && (word2Index < word2.length())) {
                if (word1.charAt(word1Index) == word2.charAt(word2Index)) {
                    charIsValid = true;
                }
                word2Index ++;
            }
            word1Index++;
        }

        if (charIsValid) {
            System.out.printf(
                    "The first word (%s) can be formed from the letters in the second word (%s)\n",
                    word1,
                    word2);
        } else {
        System.out.printf(
                "The first word (%s) cannot be formed from the letters in the second word (%s)\n",
                word1,
                word2);
        }

    }
}
