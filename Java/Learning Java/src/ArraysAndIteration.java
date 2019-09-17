public class ArraysAndIteration {
    public static void main(String[] args) {
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
