package commoninterviewtasks.interviewprograms.sortingalgorithms;

import java.sql.Time;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

//        SELECTION Sort:
//        Time complexity is ---> Big O(n2) (Big O of n in square) --> Quadratic Time because we need to use 2 loops.
//        It reduces the swapping process by finding min or max values in the "outer" loop!

        int[] arr = {4, 2, 5, 8, 3, 6};
        System.out.println("Before sorting " +Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            int key = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[key] > arr[j]) {
                    key = j;
                }
            }

            int temp = arr[key];
            arr[key] = arr[i];
            arr[i] = temp;

        }

        System.out.println("After sorting " +Arrays.toString(arr));

    }
}
