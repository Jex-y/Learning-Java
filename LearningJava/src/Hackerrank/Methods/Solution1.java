package Hackerrank.Methods;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a lower bound value");
        int lower = Integer.parseInt(input.nextLine());

        System.out.println("Enter a upper bound value");
        int upper = Integer.parseInt(input.nextLine());

        int number;
        boolean result;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            number = Integer.parseInt(input.nextLine());
            result = validate(number,lower,upper);
            System.out.println(result);
        }
    }

    public static boolean validate(int number, int lower, int upper) { return (lower <= number && number <= upper); }
}
