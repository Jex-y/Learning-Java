package Unit5.Hackerrank;

import java.util.Scanner;
import java.lang.Math;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to start at");
        int start = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number to stop at");
        int stop = Integer.parseInt(input.nextLine());
        int num = nextAllEven(start);
        while (num <= stop) {
            System.out.printf("%d\n",num);
            num = nextAllEven(num + 1);
        }
    }

    static int nextAllEven(int num) {
        char [] number = String.valueOf(num).toCharArray();
        int result = 0;
        boolean changed = false;
        for (int index = 0; index < number.length; index++) {
            int digit = (int)number[index] - 48;
            result *= 10;
            if (digit % 2 != 0 && !changed) {
                result += digit + 1;
                if (digit == 9) {
                    result += 10;
                }
                changed = true;
            } else if (!changed){
                result += digit;
            }
        }
        char [] resultChrArry = String.valueOf(result).toCharArray();
        if (resultChrArry[0] == '1') {
            result += Math.pow(10,resultChrArry.length-1);
        }
        return result;
    }
}


