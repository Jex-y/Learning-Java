public class Arrays {
    public static void main(String[] args) {
        int[] numberList = {1, 2, 3};

        // numberList values can now be changed but you cannot add any more elements to it.

        System.out.println(numberList);

        String[] helloWorld = {"Hello", "World"};

        System.out.println(helloWorld[0] + helloWorld[1]); // Outputs "HelloWorld"

        int[][] multiDimensional = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] i : multiDimensional) {
            for (int x : i) {                   // Nested loops are used to iterate through each element of each list indivually
                System.out.println(x);
            }
        }

    }
}
