package Unit1.Hackerrank.Selection;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much did the customer spend in pounds?");
        double totalSpend = Double.parseDouble(input.nextLine());

        double price;
        if (totalSpend <= 10) {
            price = (90/100)*totalSpend;
        } else if (totalSpend > 10) {
            price = (80/100)*totalSpend;
        } else {
            price = totalSpend;
        }

        System.out.printf("The final amount to pay (in pounds) is %.2f", price);
    }
}
