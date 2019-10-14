package Unit1.Hackerrank.CountedLoops;

import java.util.Scanner;


public class Solution7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the maximum number");
        int max = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }
}
