package Unit1.Hackerrank.BooleanExpressions;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the first side");
        double side1 = Double.parseDouble(input.nextLine());

        System.out.println("Enter the length of the second side");
        double side2 = Double.parseDouble(input.nextLine());

        System.out.println("Enter the length of the hypotenuse");
        double side3 = Double.parseDouble(input.nextLine());

        if (side1 + side2 > side3) {
            System.out.println("Those lengths make up a triangle");
        }
        else {
            System.out.println("Those lengths do not make up a triangle");
        }
    }
}

