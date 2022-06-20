package io.ezekielmitchell.Chater4;

public class QuickSort {

    static QuickSort qs =  new QuickSort();

    int total = 0;
    int max = 0;

    public static void main(String[] args) {
        int[] arr = {1, 601, 33, 5, 89};

        System.out.println(qs.max(arr));

    }

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



}
