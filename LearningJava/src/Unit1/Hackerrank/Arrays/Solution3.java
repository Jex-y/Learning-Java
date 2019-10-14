package Unit1.Hackerrank.Arrays;

import java.util.*;
import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        // START Do not change this code
        Scanner input = new Scanner(System.in);
        String[] allNames = Arrays.stream(input.nextLine().split("\\s+")).toArray(String[]::new);
        // END

        // Enter a name to find
        // Found name count times

        System.out.println("Enter a name to find");
        String target = input.nextLine();

        int count = 0;

        for (String name : allNames) {
            if (name.toLowerCase().equals(target.toLowerCase())) {
                count ++;
            }
        }

        System.out.printf("Found %s %d times",target,count);
    }
}

