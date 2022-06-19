package io.ezekielmitchell.Chapter3;

public class Recursion {

    static Recursion recursion = new Recursion();

    void recurse(int i) {
        System.out.println(i);
        if (i <= 0) { // base case
            return; // unnecessary
        } else {
            recurse(i - 1); // recursive case
        }
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    void greet2(String name) {
        System.out.println("how are you, " + name + "?");
    }

    void bye() {
        System.out.println("ok bye!");
    }

    public static void main(String[] args) {

        recursion.recurse(5);

        recursion.greet("Ezekiel");
    }
}
