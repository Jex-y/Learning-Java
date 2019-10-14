package Hackerrank.CountedLoops;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lower number");
        int lower = Integer.parseInt(input.nextLine());

        System.out.println("Enter the higher number");
        int higher = Integer.parseInt(input.nextLine());

        for (int i = lower; i <= higher ; i++) {
            System.out.println(i);
        }
    }
}
