package Unit5.HackerrankTest2;

        import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println("Enter a phrase");
        char[] phrase = input.nextLine().toCharArray();
        int index;
        for (int i = 0; i < phrase.length; i++) {
            index = (int)phrase[i] - 97; // No need for a comment here as it is perfectly clear what is happening.
            if (index >= 0) { letters[index] = 0; }
        }
        System.out.println("The following letters were not found");
        for (int i = 0; i < 26; i++) {
            if (letters[i] != (char)0) {
                System.out.printf("%s\n",letters[i]);
            }
        }
    }
}
