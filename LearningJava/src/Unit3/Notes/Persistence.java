package Unit3.Notes;

import java.util.Scanner;

public class Persistence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer (0-99):");
        int value = Integer.parseInt(input.nextLine());

        System.out.println("Calculate additive or multiplicative persistence (a or m)?");
        char op = input.nextLine().charAt(0);
        assert op == 'a' || op == 'm';

        int count = 0;
        while (value > 9) {
            if (op == 'a') {
                value = (value / 10) + (value % 10);
            } else {
                value = (value / 10) * (value % 10);
            }
            count ++;
        }
        System.out.printf("The persistence is %d",value);
    }
}
