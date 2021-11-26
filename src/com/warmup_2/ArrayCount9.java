package com.warmup_2;

public class ArrayCount9 {
    public static void main(String[] args) {
        /*
        * Given an array of ints, return the number of 9's in the array.
        * arrayCount9([1, 2, 9]) → 1
        * arrayCount9([1, 9, 9]) → 2
        * arrayCount9([1, 9, 9, 3, 9]) → 3
        **/

        System.out.println(arrayCount9(new int[]{1, 2, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9}));
        System.out.println(arrayCount9(new int[] {1, 9, 9, 3, 9}));

    }

    public static int arrayCount9(int[] nums) {

        int count = 0;
        for(int i: nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;

    }

}
