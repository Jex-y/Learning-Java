package Unit2.SLRS;

import java.util.Arrays;
import java.util.Scanner;

public class SLR4_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //q1(input);
        //q2(input);
        q3(input);
    }
    static void q1(Scanner input){
        int[] values = new int[5];
        int val;
        for (int year = 0; year < 5; year++) {
            System.out.printf("Enter sales for year %d:\t",year+1);
            val = Integer.parseInt(input.nextLine());
            values[year] = val;
        }
        System.out.print("Sales are: ");
        System.out.println(Arrays.toString(values));
    }

    static void q2(Scanner input){
        int[][] sales = new int[5][4];
        int val;
        for (int year = 0; year < 5; year++) {
            for (int quart = 0; quart < 4; quart++) {
                System.out.printf("Enter the sales for Q%d year %d: ", quart + 1, year + 1);
                val = Integer.parseInt(input.nextLine());
                sales[year][quart] = val;
            }
        }
        for (int[] year : sales) {
            System.out.println(Arrays.toString(year));
        }
    }

    static void q3(Scanner input) {
        int[][][] sales = new int[5][4][2];
        int val;
        for (int year = 0; year < 5; year++) {
            for (int quart = 0; quart < 4; quart++) {
                for (int dep = 0; dep < 2; dep++) {
                    System.out.printf("Enter the sales for Q%d year %d department %d: ", quart + 1, year + 1, dep + 1);
                    val = Integer.parseInt(input.nextLine());
                    sales[year][quart][dep] = val;
                }
            }
        }
        int yearNum = 1;
        for (int[][] year : sales) {
            System.out.printf("Year %d ",yearNum);
            yearNum ++;
            for (int[] quart : year) {
                System.out.printf("| ");
                for (int dep: quart) {
                    System.out.printf("%d ",dep);
                }
                System.out.printf("|");
            }
            System.out.printf("\n");
        }
    }
}
