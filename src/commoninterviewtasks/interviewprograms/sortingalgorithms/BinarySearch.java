package commoninterviewtasks.interviewprograms.sortingalgorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {60, 30, 20, 40, 50, 60};

        // Logic 1: using algorithm

        //The array must be sorted in binary search!!!
        Arrays.sort(arr);
        int searchEl = 30;

        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = (left + right)/2;

            if (arr[mid] == searchEl) {
                System.out.println(arr[mid]);
                break;
            } else if(arr[mid] < searchEl) {
                left = mid+1;
            } else {
                right = mid - 1;
            }
        }


        // Logic 2: Using Arrays.binarySearch() method

        //The array must be sorted in binary search!!!
//        Arrays.sort(arr);
//        int index = Arrays.binarySearch(arr, 30); // return an index of the target element, otherwise a negative value!
//
//        System.out.println("The element found at index " + index);

    }

}
