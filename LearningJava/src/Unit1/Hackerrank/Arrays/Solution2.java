package Unit1.Hackerrank.Arrays;

import java.util.*;
import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        // START Do not change this code
        Scanner myScanner = new Scanner(System.in);
        String[] planets = Arrays.stream(myScanner.nextLine().split("\\s+")).toArray(String[]::new);
        // END

        for (int i = 0; i < planets.length; i++) {
            System.out.printf("%s is at position %d\n",planets[i],i);

        }

        /* Enter your code here */
        // planet is at position index
    }
}

