package Unit7;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int n = 1000;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) { array[i] = i; }
        array = shuffle(array, 100);
        int[] sorted = new int[n];

        long startTime = System.nanoTime();
        sorted = bubbleSort(array.clone());
        long endTime = System.nanoTime();
        double duration = (double)(endTime - startTime)/1e+6;
        System.out.printf("Bubble sort took %.2f ms for an array of length %d and %s.\n",
                duration, n, isSorted(sorted) ? "succeed" : "failed");

        startTime = System.nanoTime();
        sorted = mergeSort(array.clone());
        endTime = System.nanoTime();
        duration = (double)(endTime - startTime)/1e+6;
        System.out.printf("Merge sort took %.2f ms for an array of length %d and %s.\n",
                duration, n, isSorted(sorted) ? "succeed" : "failed");

        startTime = System.nanoTime();
        sorted = insertionSort(array.clone());
        endTime = System.nanoTime();
        duration = (double)(endTime - startTime)/1e+6;
        System.out.printf("Insertion sort took %.2f ms for an array of length %d and %s.\n",
                duration, n, isSorted(sorted) ? "succeed" : "failed");
    }

    static int[] bubbleSort(int[] array) {
        int lastSwap = 2, sortTo = array.length-1;
        while (lastSwap > 0) {
            lastSwap = 0;
            for (int i = 0; i < sortTo; i++) {
                if (array[i] > array[i+1]) {
                    lastSwap = i;
                    array[i] = array[i] ^ array[i+1];
                    array[i+1] = array[i] ^ array[i+1];
                    array[i] = array[i] ^ array[i+1];
                }
            }
            sortTo = lastSwap+1;
        }
        return array;
    }

    static int[] mergeSort(int[] array) {
        if (array.length > 1) {
            int center = array.length / 2;
            int[] slice1 = mergeSort(getSlice(array,    0, center        ));
            int[] slice2 = mergeSort(getSlice(array,    center, array.length  ));
            int slice1Index = 0, slice2Index = 0, arrayIndex = 0;
            while (slice1Index < slice1.length && slice2Index < slice2.length) {
                if (slice1[slice1Index] < slice2[slice2Index]) {
                    array[arrayIndex] = slice1[slice1Index];
                    slice1Index++;
                } else {
                    array[arrayIndex] = slice2[slice2Index];
                    slice2Index++;
                }
                arrayIndex++;
            }

            while (slice1Index < slice1.length) {
                array[arrayIndex] = slice1[slice1Index];
                slice1Index++;
                arrayIndex++;
            }
            while (slice2Index < slice2.length) {
                array[arrayIndex] = slice2[slice2Index];
                slice2Index++;
                arrayIndex++;
            }
        }
        return array;
    }

    static int[] insertionSort(int[] array) {
        int index, value;
        for (int i = 1; i < array.length; i++) {
            value = array[i];
            index = i;
            while (index > 0 && array[index-1] > value) {
                array[index] = array[index-1];
                index --;
            }
            array[index] = value;
        }

        return array;
    }

    static int[] getSlice(int[] array, int start, int end) {
        int[] result = new int[end-start];
        for (int i = 0; i < result.length ; i++) {
            result[i] = array[i+start];
        }
        return result;
    }

    static int[] shuffle(int[] array, int passes) {
        int swapIndex;
        int temp;
        for (int pass = 0; pass < passes; pass++) {
            for (int index = 0; index < array.length; index++) {
                swapIndex = (int)(Math.random()*array.length);
                temp = array[index];
                array[index] = array[swapIndex];
                array[swapIndex] = temp;
            }
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.printf("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("\b\b ]\n");
    }

    static boolean isSorted(int[] array) {
        sorted: {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    break sorted;
                }
            }
            return true;
        }
        return false;
    }
}
