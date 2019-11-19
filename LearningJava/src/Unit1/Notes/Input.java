package Unit1.Notes;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputStr = input.nextLine(); // Read int leaves /n in buffer so readLine and then parsing is preferable.

        int myInt = Integer.parseInt(inputStr);

        System.out.println(inputStr);
    }
}
