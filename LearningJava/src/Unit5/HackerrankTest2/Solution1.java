package Unit5.HackerrankTest2;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int total = 0;
        int num;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            num = Integer.parseInt(input.nextLine());
            if (num%7 == 0){
                total += num;
                count += 1;
            }
        }
        System.out.printf("The total of numbers divisible by 7 is %d\nThe average of numbers divisible by 7 is %.2f",total,(count != 0) ? (float)total/count : 0);
    }
}
