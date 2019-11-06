package Unit2.Notes;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.printf("The third item in your shopping list is %s\n",myShopping.get(2));
        System.out.println("Changed the second item to chocolate");
        myShopping.set(1,"chocolate");
        System.out.println("Remove the last item from your shopping list");
        myShopping.remove(myShopping.size()-1);
        System.out.println("Cleared shopping list");
        myShopping.clear();
        var myDoubles = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            myDoubles.add(Math.random());
        }
        System.out.println("Sorting list of floats");
        Collections.sort(myDoubles);
        System.out.println(myDoubles);

    }
}
