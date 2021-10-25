package com.company;

public class FrontBack {
    public static void main(String[] args) {
        /*
        * Given a string, return a new string where the first and last chars have been exchanged.
        * frontBack("code") → "eodc"
        * frontBack("a") → "a"
        * frontBack("ab") → "ba"
        * */

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {

        if (str.length()-1 <= 0) return str;

        String mid = str. substring(1, str.length() -1);
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() -1);

        return lastChar + mid + firstChar;

    }

}
