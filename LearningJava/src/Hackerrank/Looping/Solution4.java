package Hackerrank.Looping;

public class Solution4 {
    public static void main(String[] args) {
        boolean output = false;
        for (int i = 1; i <= 110 ; i++) {
            if (i%3 == 0) {
                System.out.print("Coza");
                output = true;
            }
            if (i%5 == 0) {
                System.out.print("Loza");
                output = true;
            }
            if (i%7 ==0) {
                System.out.print("Woza");
                output = true;
            }
            if (!output) {
                System.out.print(i);
            }
            if (i%11 == 0){
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
            output = false;
        }
    }
}