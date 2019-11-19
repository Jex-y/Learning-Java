package Unit1.Hackerrank.Methods;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base ");
        int base = Integer.parseInt(input.nextLine());

        System.out.println("Enter the exponent");
        int exp = Integer.parseInt(input.nextLine());

        int result = exponent(base, exp);

        System.out.printf("%d raised to the power of %d is %d", base, exp, result);
    }

    private static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
