package Unit1.Notes;

import java.util.Scanner; // IMPORTANT - You must import this library in order to use the Scanner object and thus take input.

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputStr = input.nextLine(); // Read int leaves /n in buffer so readLine and then parsing is preferable.

        int myInt = Integer.parseInt(inputStr);

        System.out.println(inputStr);
    }
}
