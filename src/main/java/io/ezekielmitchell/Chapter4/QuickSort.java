package io.ezekielmitchell.Chapter4;

public class QuickSort {

    static QuickSort qs =  new QuickSort();

    int total = 0;
    int max = 0;


    private int sumX(int[] arr, int i) {
        total += arr[i];
        if (i < arr.length-1) {
            sumX(arr, i+1);
        }
        return total;
    }

    public int sum(int[] arr) {
        return sumX(arr, 0);
    }

    private int maxX(int[] arr, int i) {

        if (i < arr.length-1) {
            if (arr[i] > max) {
                max = arr[i];
            }
            maxX(arr, i+1);
        }
        return max;
    }

    public int max(int[] arr) {
        return maxX(arr, 0);
    }

    public static int[] quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return array;
        }

        int pivot = array[highIndex];

        int leftPointer = getLeftPointer(array, lowIndex, highIndex, pivot);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

        return array;
    }

    private static int getLeftPointer(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while  (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }



}
