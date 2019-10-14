import java.math.*;

import static java.lang.Math.*;
import java.math.BigInteger;

public class Problem3 {
    public static void main(String[] args) {
        long n = 1;
        long largest = 1;
        while (n %2 == 0) {
            largest = 2;
            n /= 2;
        }
        for (long i = 3; i < sqrt(n); i+=2) {
            while (n%i == 0) {
                largest = i;
                n /= i;
            }
        }
        if (n > largest) {
            largest = n;
        }

        System.out.println(largest);
    }
}
