/**
 * Complexity: O(1) [avg] "Constant time" || O(n) [worst case] "Linear time"
 * Purposes: modeling relationships, filtering out dups, caching
 */

package io.ezekielmitchell.Chapter5;

import java.util.Hashtable;

public class HashTables {

    public static void main(String[] args) {

        // key, value pairs
        Hashtable<Integer, String> table = new Hashtable<>();

        // if keys overlap, a linked list is made for the index of the overlapping keys
        table.put(230, "Pease");
        table.put(250, "Ohlsson");
        table.put(240, "Murry");
        table.put(260, "Del");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + " \t:\t " + table.get(key));
        }

        Hashtable<String, String> table1 = new Hashtable<>();

        table1.put("230", "Pease");
        table1.put("250", "Ohlsson");
        table1.put("240", "Murry");
        table1.put("260", "Del");

        for (String key : table1.keySet()) {
            // different data types have different hashCode formulas
            System.out.println(key.hashCode() + "\t" + key + " \t:\t " + table1.get(key));
        }

        // Hash functions is when a string is inputted and a number is return

        Hashtable<String, Integer> hashFunctions = new Hashtable<>();
        hashFunctions.put("Ezekiel", 24);
        hashFunctions.put("Ohlsson", 25);
        hashFunctions.put("Pease", 23);

        for (String key : hashFunctions.keySet()) {
            // different data types have different hashCode formulas
            System.out.println(key.hashCode() + "\t" + key + " \t:\t " + hashFunctions.get(key));
        }

    }
}
