package Unit7;

import java.util.Scanner;

public class SearchAlgorithms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) { array[i] = (int)(Math.random()*10); }
        System.out.printf("The array is [ ");
        for (int i = 0; i < array.length; i++) { System.out.printf("%d, ",array[i]); }
        System.out.printf("\b\b ]\n");
        System.out.print("Enter a value to search for: ");
        int value = Integer.parseInt(input.nextLine());
        System.out.printf("Using linear search, the index of %d is %d\n", value, linearSearch(array,value));

        for (int i = 0; i < 10; i++) { array[i] = i+1; }
        System.out.printf("The array is [ ");
        for (int i = 0; i < array.length; i++) { System.out.printf("%d, ",array[i]); }
        System.out.printf("\b\b ]\n");
        System.out.print("Enter a value to search for: ");
        value = Integer.parseInt(input.nextLine());
        System.out.printf("Using iterative binary search, the index of %d is %d\n", value, iterativeBinary(array,value));
        System.out.printf("Using recursive binary search, the index of %d is %d\n", value, recursiveBinary(array,value, 0, array.length-1));

    }

    static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    static int iterativeBinary(int[] array, int value) {
       int low = 0;
       int high = array.length-1;
       int index = 0;
       boolean done = false;
       while (!done){
           index = (high + low)/2;
           if (high <= low) {
               done = true;
               index = -1;
           } else if (array[index] < value) {
                low = index + 1;
           } else if (array[index] > value) {
                high = index - 1;
           } else {
                done = true;
           }
       }
       return index;
    }

    static int recursiveBinary(int array[], int value, int low, int high) {
        int index = (high+low)/2;
        if (high <= low) {
            return -1;
        } else if (array[index] > value) {
            return recursiveBinary(array, value, low, index-1);
        } else if (array[index] < value) {
            return recursiveBinary(array, value, index+1, high);
        } else {
            return index;
        }
    }
}
