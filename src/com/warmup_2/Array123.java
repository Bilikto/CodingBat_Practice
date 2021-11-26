package com.warmup_2;

public class Array123 {
    public static void main(String[] args) {
        /*
        * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        * array123([1, 1, 2, 3, 1]) → true
        * array123([1, 1, 2, 4, 1]) → false
        * array123([1, 1, 2, 1, 2, 3]) → true
        * */

        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));

    }

    public static boolean array123(int[] nums) {
        String str = "";
        for(int num: nums) {
            str += num;
            for(int i = 0; i < str.length(); i++) {
                if(str.substring(i).equals("123")) {
                    return true;
                }
            }
        }

        return false;
    }

}
