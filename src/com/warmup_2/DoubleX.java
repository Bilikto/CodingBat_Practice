package com.warmup_2;

public class DoubleX {
    public static void main(String[] args) {
        /*
        * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        *
        * doubleX("axxbb") → true
        * doubleX("axaxax") → false
        * doubleX("xxxxx") → true
        * */

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));


    }

    static boolean  doubleX(String str) {

        if (str.contains("x")) {
            int index = str. indexOf('x');
            String s = str.substring(index);
            return s.startsWith("xx");
        }
        return false;

    }
}
