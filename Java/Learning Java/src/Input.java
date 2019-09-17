import java.util.Scanner; // IMPORTANT - You must import this library in order to use the Scanner object and thus take input.

public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Initialise a new scanner object

        String input = myScanner.nextLine();

        System.out.println("You said: " + input);

        // IMPORTANT - Do not use myScanner.nextInt(); as it may break the lines above or below it and skip them

        // Instead, do this:

        int number = Integer.parseInt(myScanner.nextLine()); // Use a try statement if you are not 100% the input will be an int.

        System.out.println(number);
    }
}
