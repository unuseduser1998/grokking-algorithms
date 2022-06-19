package io.ezekielmitchell.Chapter2.ArraysLinkedLists;

import java.util.Arrays;

/**
 * Complexity: O(n^2)
 */

public class SelectionSort {
    // sort the array
    public static void selectionSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int lowestInteger = i;

            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[lowestInteger]) {
                    lowestInteger = j;
                }
            }

            int temp = array[lowestInteger];
            array[lowestInteger] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] list = {2,1,6,4,7};

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(list));

        System.out.println("\nSorted array:");
        selectionSort(list);

    }

}