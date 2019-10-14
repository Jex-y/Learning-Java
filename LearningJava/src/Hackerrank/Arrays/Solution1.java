package Hackerrank.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        String[] names = {"Fred", "Wilma", "Barney", "Betty"};
        int[] scores = {80, 85, 70, 60};

        int index = 2;
        System.out.printf("%s scored %d\n",names[index],scores[index]);

        scores[index] = 50;

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s scored %d\n",names[i],scores[i]);
        }
    }
}
