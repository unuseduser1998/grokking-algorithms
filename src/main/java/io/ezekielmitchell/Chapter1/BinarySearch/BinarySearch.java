package io.ezekielmitchell.Chapter1.BinarySearch;

import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        // binary search is an algorithms that returns the position of the searched input of a {SORTED} list
        // the binary search algo tries the middle number, then continues to cut the list in half
        // until the input is found
        // Complexity: Olog(N) worst case


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 128; i++) {
            numbers.add(new Random().nextInt(100));
        }

        for (int n : numbers) {
            System.out.println(n);
        }

        System.out.println(binarySearch(numbers, 44));



    }

    public static int binarySearch(ArrayList list, int item) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int middle = (low + high)/2;
            int guess = (int) list.get(middle);

            if (guess == item) { // checks if the middle index == item
                return middle;
            } else if (guess > item) { // if index > item ->
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
