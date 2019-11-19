package Unit1.Hackerrank.BooleanExpressions;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = Integer.parseInt(input.nextLine());

        boolean case1 = (num % 2 != 0 && String.valueOf(num).length() == 2);
        boolean case2 = (num % 2 == 0 && String.valueOf(num).length() == 3);

        if (case1 || case2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

