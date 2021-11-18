package com.warmup_2;

public class StringSplosion {
    public static void main(String[] args) {
        /*
        * Given a non-empty string like "Code" return a string like "CCoCodCode".
        *
        * stringSplosion("Code") → "CCoCodCode"
        * stringSplosion("abc") → "aababc"
        * stringSplosion("ab") → "aab"
        * */

        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            s +=  str.substring(0, i + 1);
        }
        return s;
    }
}
