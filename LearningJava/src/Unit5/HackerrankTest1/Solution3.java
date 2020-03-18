package Unit5.HackerrankTest1;

        import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase");
        char [] text = input.nextLine().toCharArray();
        int digit;
        int total = 0;
        for (char chr: text) {
            digit = (int)chr - 48;
            if (0 <= digit && digit <= 9) {
                total += digit;
            }
        }
        System.out.printf("The digits add up to %d\n",total);
    }
}
