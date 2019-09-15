public class Iteration {
    public static void main(String[] args) {
        // While loops

        int count = 0;

        while (count < 3) {
            System.out.println(count);
            count++;
        }

        // For loops

        for (int i = 0; i < 3; i++) { // Essentially the lines above but in a much more compact and efficient way
            System.out.println(i);
        }

        // For Each loops (For In in Python3)

        int[] numList = {1, 2, 3};

        for (int x : numList ) {
            System.out.println(x);
        }


        // String indexes
        /*
        Strings are not treated strongly as arrays in java, so stringName[x] will not work.
        In order to find the char at index x, we must use charAt()
         */


        String phrase = "Hello World";

        System.out.println("The first letter of the phrase is " + phrase.charAt(0));
    }
}
