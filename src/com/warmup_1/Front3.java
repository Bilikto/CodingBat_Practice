package com.warmup_1;

public class Front3 {
    public static void main(String[] args) {
        /*
        * Given a string, we'll say that the front is the first 3 chars of the string.
        * If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

        * front3("Java") → "JavJavJav"
        * front3("Chocolate") → "ChoChoCho"
        * front3("abc") → "abcabcabc"
        **/

        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("ab"));
    }
    public static String front3(String str) {
        String newStr = " ";

        if (str.length()-1 < 3) {
            newStr = str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length());
        } else {
            newStr = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }

        return newStr;


//        String front;
//        if (str.length() >= 3) {
//            front = str.substring(0, 3);
//        }
//        else {
//            front = str;
//        }
//
//        return front + front + front;

    }
}
