package com.warmup_1;

public class NearHundred {
    public static void main(String[] args) {
        /*
        * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        * nearHundred(93) → true
        * nearHundred(90) → true
        * nearHundred(89) → false
        * */
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(-98));
        System.out.println(nearHundred(109));
        System.out.println(nearHundred(210));
        System.out.println(nearHundred(-101));
        System.out.println(nearHundred(-209));
        System.out.println(100 -  -98); //198

    }

    public static boolean nearHundred(int n) {

       //return (n >= 90 && n <= 100 || n > 100 && n <= 110) || (n >= 190 && n <= 200 || n> 200 && n <= 210);
       return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));

    }

}
