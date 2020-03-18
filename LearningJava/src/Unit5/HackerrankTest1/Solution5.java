package Unit5.HackerrankTest1;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int length = 0;
        int num;
        while (total != 0 || length == 0) {
            System.out.println("Enter a number");
            num = Integer.parseInt(input.nextLine());
            length ++;
            total += num;
        }
        System.out.printf("The running total is zero. You entered %d numbers",length);

    }
}
