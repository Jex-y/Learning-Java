package Unit1.Notes;

public class Iteration {
    public static void main(String[] args) {
        // While loops

        int count = 0;

        while (count < 3) {
            System.out.println(count);
            count++;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] colours = {"Red", "Green", "Blue", "Orange"};

        for (int i = 0; i < colours.length; i++) { // This Works
            System.out.println(colours[i]);
        }
        System.out.println("\n\n");
        for (String col : colours) { // But this is more readable
            System.out.println(col);
        }

    }
}
