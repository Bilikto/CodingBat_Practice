package com.warmup_2;

import org.junit.Test;

public class FrontTimes {

//    public static void main(String[] args) {
//        /*
//        * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
//        * whatever is there if the string is less than length 3. Return n copies of the front;
//        * frontTimes("Chocolate", 2) → "ChoCho"
//        * frontTimes("Chocolate", 3) → "ChoChoCho"
//        * frontTimes("Abc", 3) → "AbcAbcAbc"
//        * */
//        System.out.println(frontTimes("Chocolate", 2));
//        System.out.println(frontTimes("Chocolate", 3));
//        System.out.println(frontTimes("Abc", 3));
//        System.out.println(frontTimes("Ab", 4));
//        System.out.println(frontTimes("A", 4));
//        System.out.println(frontTimes("", 4));
//        System.out.println(frontTimes("", 0));
//    }

    public String frontTimes(String str, int n) {

        //Solution #1
        String front3 = "";
        if (str.length() < 3) {
            for(int i = 1; i <= n; i++) {
                front3 += str;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                front3 += str.substring(0, 3);
            }
        }

        return front3;


          //Solution #2
//        int frontLen = 3;
//        if (frontLen > str.length()) {
//            frontLen = str.length();
//        }
//        String front = str.substring(0, frontLen);
//
//        String res = "";
//        for(int i = 0; i < n; i++) {
//            res += front;
//        }
//        return res;
    }

}
