package Unit3.Notes;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] ISBN = new int [13];
        for (int count = 0; count < 13; count++) {
            System.out.println("Please enter the next digit of ISBN:");
            ISBN[count] = Integer.parseInt(input.nextLine());
        }

        int CalculatedDigit = 0;
        int count = 0;

        while (count < 12) {
            CalculatedDigit += ISBN[count];
            count++;
            CalculatedDigit += ISBN[count]*3;
            count++;
        }

        while (CalculatedDigit >= 10) { CalculatedDigit -= 10; }

        CalculatedDigit = 10 - CalculatedDigit;

        if (CalculatedDigit == 10) { CalculatedDigit = 0; }

        if (CalculatedDigit == ISBN[12]) {
            System.out.println("Valid ISBN");
        } else {
            System.out.println("Invalid ISBN");
        }
    }
}
