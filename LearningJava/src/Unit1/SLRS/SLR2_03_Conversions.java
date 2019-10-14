package Unit1.SLRS;

import java.util.Scanner;
public class SLR2_03_Conversions {
    public static void main(String[] args) {
        menu();
    }

    static double cmToInches(double cm) {
        return cm / 2.54;
    }

    static double inchesToCm(double inches) {
        return inches * 2.54;
    }

    static void menu() {
        Scanner myScanner = new Scanner(System.in);
        double cm;
        double inches;

        int choice = 0;
        while (choice != 3) {
            System.out.println("1. cm to inches");
            System.out.println("2. inches to cm");
            System.out.println("3. Quit");
            choice = 0;
            while (choice < 1 || choice > 3) {
                System.out.print("? ");
                choice = myScanner.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in cm ");
                    cm = myScanner.nextDouble();
                    inches = cmToInches(cm);
                    System.out.printf("%.3f cm is %.3f inches",cm ,inches);
                    break;
                case 2:
                    System.out.print("Enter amount in inches ");
                    inches = myScanner.nextDouble();
                    cm = inchesToCm(inches);
                    System.out.printf("%.3f inches is %.3f cm", inches, cm);
                    break;
            }
        }
    }
}