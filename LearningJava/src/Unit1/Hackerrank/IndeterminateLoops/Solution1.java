package Unit1.Hackerrank.IndeterminateLoops;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (sum < 100){
            System.out.println("Enter an integer");
            sum += Integer.parseInt(input.nextLine());
        }
        System.out.printf("Total was %d",sum);
    }
}
