package Hackerrank.Selection;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the selling price in pounds");
        double sell = Double.parseDouble(input.nextLine());

        System.out.println("Enter the cost price in pounds");
        double buy = Double.parseDouble(input.nextLine());

        double profit = sell - buy;

        if (profit > 0) {
            System.out.println("You made a profit");
        } else if (profit < 0) {
            System.out.println("You made a loss");
        } else {
            System.out.println("You broke even");
        }
    }
}
