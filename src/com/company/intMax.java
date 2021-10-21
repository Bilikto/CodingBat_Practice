package com.company;

public class intMax {
    public static void main(String[] args) {
        /*
        * Given three int values, a b c, return the largest.
        * intMax(1, 2, 3) → 3
        * intMax(1, 3, 2) → 3
        * intMax(3, 2, 1) → 3
        * */
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    public static int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }
}
