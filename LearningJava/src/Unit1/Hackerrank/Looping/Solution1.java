package Unit1.Hackerrank.Looping;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number");
        int second = Integer.parseInt(input.nextLine());

        for (int i = ((first < second) ? first : second); i <= ((second > first ) ? second : first); i++) {
            System.out.println(i);
        }

    }
}
