package com.warmup_1;

public class mixStar {
    public static void main(String[] args) {
        /*
        * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
        * mixStart("mix snacks") → true
        * mixStart("pix snacks") → true
        * mixStart("piz snacks") → false
        * */

        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println(mixStart("ni"));
        System.out.println(mixStart("n"));
        System.out.println(mixStart(""));

    }

    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring(1, 3).startsWith("ix");
    }
}
