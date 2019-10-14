package Hackerrank.BooleanExpressions;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        double num = Double.parseDouble(input.nextLine());

        System.out.println("Enter a divisor");
        double div = Double.parseDouble(input.nextLine());

        double result = num % div;

        if (result == 0) {
            System.out.printf("%d is a factor of %d",(long)div, (long)num);
        }
        else {
            System.out.printf("%d is not a factor of %d",(long)div, (long)num);
        }

    }
}
