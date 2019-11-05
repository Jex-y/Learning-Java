package Unit1.Hackerrank.Methods;

public class Solution3 {
    public static void main(String[] args) {
        long sum = 0;
        int num2;
        for (int num1 = 0; num1 < 10000; num1++) {
            num2 = sumOfFactors(num1);
            if (isAmicable(num1,num2)) {sum += num1;}
        }
        System.out.println(sum);
    }

    private static int sumOfFactors(int number) {
        int sum = 1;
        int divisor = 2;
        int last = number;
        while (divisor < last) {
            if (number % divisor == 0) {
                sum += divisor;
                last = number/divisor;
                sum += last;
            }
            divisor++;
        }
        return sum;
    }

    private static boolean isAmicable(int num1, int num2) {
        return (!(num1 == num2) && sumOfFactors(num1) == num2 && sumOfFactors(num2) == num1);
    }
}

