package Unit5.HackerrankTest2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        int num;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            num = Integer.parseInt(input.nextLine());
            if (i == 0){
                smallest = num;
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }
        System.out.printf("The smallest number was %d\nThe largest number was %d\n",smallest,largest);
    }
}
