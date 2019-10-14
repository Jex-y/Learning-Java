package SLRS;

import java.util.Scanner;
public class SLR2_03_Conversions_answer {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner myScanner = new Scanner(System.in);
        double cm;
        double inches;

        int choice = 0;
        while (choice != 3) {
            System.out.println("1. cm to inches");
            System.out.println("2. inches to cm");
            System.out.println("3. Quit");
            choice = 0;
            while (choice < 1 || choice > 3)  {
                System.out.print("? ");
                choice = myScanner.nextInt();
            }

            switch(choice){
                case 1:
                    System.out.print("Enter amount in cm ");
                    cm = myScanner.nextFloat();
                    inches = cmToInches(cm);
                    System.out.println(cm + " cm is " + inches + " inches");
                    break;
                case 2:
                    System.out.print("Enter amount in inches ");
                    inches = myScanner.nextFloat();
                    cm = inchesToCm(inches);
                    System.out.println(inches + " inches is " + cm + " cm");
                    break;
            }
        }
    }

    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }
}
