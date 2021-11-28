package com.warmup_2;

public class StringX {
    public static void main(String[] args) {
        /*
        * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
        *
        * stringX("xxHxix") → "xHix"
        * stringX("abxxxcd") → "abcd"
        * stringX("xabxxxcdx") → "xabcdx"
        * */
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
        System.out.println(stringX("x"));
        System.out.println(stringX("a"));

    }

    public static String stringX(String str) {
        if (str.length() > 2) {
            if (str.startsWith("x") && str.endsWith("x")) {
                return "x" + str.substring(1, str.length() - 1).replaceAll("x", "") + "x";
            } else {
                return str.replaceAll("x", "");
            }
        } else {
            return str;
        }
    }

}
