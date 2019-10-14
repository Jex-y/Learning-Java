package Unit1.Hackerrank.MoreAboutStrings;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the data");

        String data = input.nextLine();
        double price = Double.parseDouble(data.substring(6));

        System.out.printf("The ticket costs £%.2f",price);
    }
}
