package commoninterviewtasks.interviewprograms.sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 8, 3, 6};

        System.out.println("Before sorting " + Arrays.toString(arr));

        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        System.out.println("After sorting " +Arrays.toString(arr));
    }
}
