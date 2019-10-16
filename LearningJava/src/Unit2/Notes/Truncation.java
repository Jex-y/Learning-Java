package Unit2.Notes;

import java.util.Scanner;

public class Truncation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short num1 = 32766;
        System.out.print("Enter a small number: ");
        short num2 = Short.parseShort(input.nextLine());

        short total = (short) (num1 + num2);
        System.out.printf("%d + %d = %d\n",num1,num2,total);
    }
}
