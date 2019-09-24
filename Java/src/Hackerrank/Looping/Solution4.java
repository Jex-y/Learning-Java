package Hackerrank.Looping;

public class Solution4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 110 ; i++) {
            if (i%3 == 0) {
                System.out.print("Coza");
            }
            if (i%5 == 0) {
                System.out.print("Loza");
            }
            if (i%7 ==0) {
                System.out.print("Woza");
            }
            if (i%11 == 0){
                System.out.print("\n");
            }
        }
    }
}