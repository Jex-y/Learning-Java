package Unit1.Hackerrank.Looping;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int loop = Integer.parseInt(input.nextLine());
        int num;
        int lowest = 2147483647;
        int highest = -2147483648;
        for (int i = 0; i < loop; i++) {
            System.out.println("Enter a number");
            num = Integer.parseInt(input.nextLine());
            if (num < lowest) {
                lowest = num;
            }
            if (num > highest) {
                highest = num;
            }
        }
        System.out.printf("The lowest number was %d\nThe highest number was %d", lowest, highest);
    }
}