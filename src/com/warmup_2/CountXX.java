package com.warmup_2;

public class CountXX {
//    public static void main(String[] args) {
//        /*
//        * git .
//        *
//        * countXX("abcxx") → 1
//        * countXX("xxx") → 2
//        * countXX("xxxx") → 3
//        * */
//
//        System.out.println(countXX("abcxx"));
//        System.out.println(countXX("xxx"));
//        System.out.println(countXX("xxxx"));
//    }

    public int countXX(String str) {
        int count = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx"))
                count++;
            }
        return count;
        }
}
