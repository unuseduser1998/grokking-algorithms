package io.ezekielmitchell.Chapter2.ArraysLinkedLists;

import java.util.*;

/* Linked Lists
   - items can be anywhere in memory with linked lists
   - each item stores the address of the next item in the list
   - a bunch of random memory addresses are linked together
   - the position of the element in call its index
   - insertions and deletions are O(1) only if I can instantaneously access the element to be deleted
   - two different types of access: Random [can jump directly to element] & Sequential [reading one-by-one] access
   - Linked Lists only use Sequential access
 */


public class ArraysLinkedLists {
    public static void main(String[] args) {

        linkedLists();


    }

    public static void linkedLists() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i : list) {
            System.out.println(i);
        }
    }
}
