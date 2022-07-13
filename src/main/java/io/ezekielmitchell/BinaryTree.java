package io.ezekielmitchell;

public class BinaryTree {

    public static void main(String[] args) {
        Node rt = new Node();
        rt.data = 1;

        Node lefter = new Node();
        lefter.data = 0;

        Node righter = new Node();
        righter.data = 2;

        rt.left = lefter;
        rt.right = righter;

        System.out.println(rt.getData());
    }
}
