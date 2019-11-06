package Unit2.Notes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        var myShopping = new ArrayList<String>();
        String data;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five items:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\t");
            data = input.nextLine();
            myShopping.add(data);
        }
        System.out.println(myShopping);
    }
}
