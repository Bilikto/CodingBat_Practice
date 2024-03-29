package commoninterviewtasks.datastructure;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        // LINEAR search
        int[] nums = {11, 21, 5, 7, 9, 26, 16, 32};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int target = 32;

//        int result = linearSearch(nums, target);
//        int result = binarySearch(nums, target);
        int result = binarySearchByUsingRecursion(nums, target, 0, nums.length);

        if(result != -1) {
            System.out.println("Your target index is: " + result);
        } else {
            System.out.println("The index not found");
        }

    }


    public static int linearSearch(int[] nums, int target) {
        int ind = -1;
        int steps = 0;

        for(int i = 0; i < nums.length; i++) {
            steps++;
            if(nums[i] == target) ind = i;
        }
        System.out.println("The linear search takes " + steps + " steps"); // it takes 8 steps because of 8 elements in the array
        return ind;
    }


    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int steps = 0;

        while(left <= right) {
            int mid = (left + right)/2;
            steps++;

            if(nums[mid] == target) {
                System.out.println("Steps taken by binarySearch() method " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }


    // Binary search using Recursion
    public static int binarySearchByUsingRecursion(int[] nums, int target, int left, int right) {
        int mid = (left+right)/2;
        int steps = 0;
        steps++;

        if(nums[mid] == target) {
            System.out.println("Steps taken by binarySearchByUsingRecursion() method " + steps);
            return mid;
        } else if(nums[left] < target) {
            return binarySearchByUsingRecursion(nums, target, mid+1, right);
        } else {
            return binarySearchByUsingRecursion(nums, target, left, mid-1);
        }
    }

}
