package Unit1.Hackerrank.CountedLoops;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            sum +=  Integer.parseInt(input.nextLine());
        }
        System.out.printf("Total is %d\n",sum);
    }
}
