package Unit1.Hackerrank.BooleanExpressions;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = Integer.parseInt(input.nextLine());

        System.out.println("Enter the lower range bound");
        int lower = Integer.parseInt(input.nextLine());

        System.out.println("Enter the upper range bound");
        int upper = Integer.parseInt(input.nextLine());

        if (lower <= num && upper >= num) {
            System.out.printf("%d is in the range of %d to %d", num, lower, upper);
        } else {
            System.out.printf("%d is not in the range of %d to %d", num, lower, upper);
        }
    }
}

