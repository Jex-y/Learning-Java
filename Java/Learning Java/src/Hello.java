import java.awt.*;
import java.util.Scanner;

public class solution {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second number");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the third number");
        int num3 = Integer.parseInt(input.nextLine());

        if (num1 > num2){
            if (num1 > num3) {
                System.out.printf("The largest number is %d\n",num1);
            } else {
                System.out.printf("The largest number is %d\n",num3);
            }
        }
        else {
            if (num2 > num3) {
                System.out.printf("The largest number is %d\n",num2);
            } else {
                System.out.printf("The largest number is %d\n",num3);
            }
        System.out.printf("The average is %.2f\n",(double)(num1+num2+num3)/3);
        System.exit(0);
        }
    }
}