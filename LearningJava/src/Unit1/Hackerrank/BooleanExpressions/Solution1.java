package Unit1.Hackerrank.BooleanExpressions;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the length of side a");
        double a = Double.parseDouble(input.nextLine());

            System.out.println("Enter the length of side b");
        double b = Double.parseDouble(input.nextLine());

            System.out.println("Enter the length of side c");
        double c = Double.parseDouble(input.nextLine());

            if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))

        {
            System.out.println("That is a right-angled triangle");
        }
            else

        {
            System.out.println("That is not a right-angled triangle");
        }
    }
}
