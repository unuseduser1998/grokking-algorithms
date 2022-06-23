package io.ezekielmitchell.Chapter4;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    QuickSort qs = new QuickSort();
    public int[] arr = {22, 34, 2, 12, 44, 74, 2, 98, 4, 23, 90};

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(405, qs.sum(arr));
    }

    @org.junit.jupiter.api.Test
    void max() {
        assertEquals(98, qs.max(arr));
    }

    @org.junit.jupiter.api.Test
    void quicksort() {
        int[] arrUnsorted = {3, 5, 1, 4, 2};
        int[] arrSorted = {1, 2, 3, 4, 5};
        assertArrayEquals(arrSorted, QuickSort.quicksort(arrUnsorted, 0, arrUnsorted.length-1));
    }
}