package io.ezekielmitchell.Chapter2.ArraysLinkedLists;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = selectionSort();
        isSorted(list);
        sort(list);
    }

    public static ArrayList<Integer> selectionSort() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            list.add(random.nextInt(25));
        }

        return list;
    }

    public static boolean isSorted(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) > arrayList.get(i+1)) {
                System.out.println("Is not sorted");
                return false;
            }
        }
        System.out.println("Is sorted");
        return true;
    }

    public static void sort(ArrayList<Integer> list) {

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("-------");

        while (!(isSorted(list))) {
            for (int i : list) {
                if (i > list.get(list.indexOf(i)+1)) {
                    list.set(list.indexOf(i), list.get(listt))
                }
            }
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
