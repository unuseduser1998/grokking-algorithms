package io.ezekielmitchell.Chapter2.ArraysLinkedLists;

import java.util.*;

public class SelectionSort {

    // selection sort creates a new array of ordered values
    public static void main(String[] args) {

        int[] list = new int[10];

        Random random = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(0, 15);
        }

        System.out.println(Arrays.toString(list));

        System.out.println(Arrays.toString(selectionSort(list)));

    }

    public static int findMinimum(int[] list) {
        int min = list[0];
        int minIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] selectionSort(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            int smallest = list[findMinimum(list)];
            newList[i] = smallest;
        }
        return newList;
    }
}
