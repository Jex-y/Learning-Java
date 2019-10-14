package Unit1.Hackerrank.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Solution5 {
    public static void main(String args[] ) throws Exception {
        // START Do not change this code
        Scanner input = new Scanner(System.in);
        String[] row1 = Arrays.stream(input.nextLine().split("\\s+")).toArray(String[]::new);
        String[] row2 = Arrays.stream(input.nextLine().split("\\s+")).toArray(String[]::new);
        String[] row3 = Arrays.stream(input.nextLine().split("\\s+")).toArray(String[]::new);
        String[][] board = {row1, row2, row3};
        // END

        // Enter a word to find
        // Found <count> occurrences of <word>

        System.out.println("Enter a word to find");
        String word = input.nextLine();

        int count = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.toLowerCase().equals(board[i][j].toLowerCase())) {
                    count ++;
                }
            }
        }
        System.out.printf("Found %d occurrences of %s\n",count,word);
    }
}

