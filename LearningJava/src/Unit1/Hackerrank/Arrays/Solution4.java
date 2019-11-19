package Unit1.Hackerrank.Arrays;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many colours will you enter?");
        int count = Integer.parseInt(input.nextLine());
        String[] colours = new String[count];

        int yellowCount = 0;
        int blueCount = 0;
        int redCount = 0;

        String buffer;

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a colour");
            buffer = input.nextLine().toUpperCase();
            switch (buffer) {
                case ("YELLOW"):
                    yellowCount++;
                    break;
                case ("BLUE"):
                    blueCount++;
                    break;
                case ("RED"):
                    redCount++;
                    break;
            }
            colours[i] = buffer;
        }
        System.out.printf("YELLOW: %d\nBLUE: %d\nRED: %d\n", yellowCount, blueCount, redCount);
    }
}
