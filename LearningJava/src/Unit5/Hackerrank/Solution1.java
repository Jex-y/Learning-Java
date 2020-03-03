package Unit5.Hackerrank;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mobile number");
        char [] number = input.nextLine().toCharArray();
        System.out.println("Enter the digits");
        char [] digits = input.nextLine().toCharArray();
        for (char character: number) {
            char digit;
            for (int index = 0; index < digits.length; index++) {
                digit = digits[index];
                if (digit == character && digit != (char)0) {
                    digits[index] = (char)0;
                }
            }
        }
        System.out.println("The missing digits are");
        for (char digit: digits) {
            if (digit != (char)0) {
                System.out.printf("%s\n",digit);;
            }
        }
    }
}
