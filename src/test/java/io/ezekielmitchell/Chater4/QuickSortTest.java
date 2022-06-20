package io.ezekielmitchell.Chater4;

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
}