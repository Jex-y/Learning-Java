package Unit1.Hackerrank.Selection;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month name");
        String month = input.nextLine();

        int days;

        switch (month.toLowerCase()){
            case "january":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            case "march":
                days = 31;
                break;
            case "april":
                days = 30;
                break;
            case "may":
                days = 31;
                break;
            case "june":
                days = 30;
                break;
            case "july":
                days = 31;
                break;
            case "august":
                days = 31;
                break;
            case "september":
                days = 30;
                break;
            case "october":
                days = 31;
                break;
            case "november":
                days = 30;
                break;
            case "december":
                days = 31;
                break;
            default:
                days = 0;
        }
        System.out.printf("There are %d days in %s",days,month);
    }
}
