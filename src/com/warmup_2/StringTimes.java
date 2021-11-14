package com.warmup_2;

public class StringTimes {
    public static void main(String[] args) {
        /*
        * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        *
        * stringTimes("Hi", 2) → "HiHi"
        * stringTimes("Hi", 3) → "HiHiHi"
        * stringTimes("Hi", 1) → "Hi"
        * */

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hi", 0));

    }

    public static String stringTimes(String str, int n) {

        String s = "";

        for(int i = 1; i <= n; i++) {
            s += str;
        }
        return s;
    }

}
