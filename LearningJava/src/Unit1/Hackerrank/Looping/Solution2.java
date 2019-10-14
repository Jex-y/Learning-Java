package Unit1.Hackerrank.Looping;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks will you enter?");
        int num = Integer.parseInt(input.nextLine());

        int top = 0;
        int mark;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter a test mark");
            mark = Integer.parseInt(input.nextLine());
            top = (mark > top) ? mark : top;
        }

        System.out.printf("The highest mark was %d",top);
    }
}
