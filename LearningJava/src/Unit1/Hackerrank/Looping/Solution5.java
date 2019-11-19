package Unit1.Hackerrank.Looping;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int count = Integer.parseInt(input.nextLine());

        System.out.printf("The first %d Fibonacci numbers are:\n", count);
        int last1 = 1;
        int last2 = 1;
        int buff;
        for (int i = 0; i < count; i++) {
            if (i == 0 || i == 1) {
                System.out.print("1 ");
            } else {
                buff = last1 + last2;
                last2 = last1;
                last1 = buff;
                System.out.printf("%d ", buff);
            }

        }
    }
}
