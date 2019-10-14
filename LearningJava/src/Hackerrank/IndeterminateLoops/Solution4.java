package Hackerrank.IndeterminateLoops;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int temp;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer");
            temp = Integer.parseInt(input.nextLine());
            System.out.printf((temp%2 == 1) ? "%d is odd\n" : "%d is even\n",temp);
            sum += temp;
        }
        System.out.printf("Total of all numbers is %d",sum);
    }
}
