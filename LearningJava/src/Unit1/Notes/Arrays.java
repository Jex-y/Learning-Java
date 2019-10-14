package Unit1.Notes;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array);

        int [][] array2d = { {1, 2, 3 } , { 4, 5, 6 } };

        for (int [] i : array2d) {
            for (int j : i) {
                System.out.println(j);
            }
        }

    }
}
