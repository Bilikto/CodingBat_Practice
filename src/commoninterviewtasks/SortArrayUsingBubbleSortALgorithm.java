package commoninterviewtasks;

import java.util.Arrays;

public class SortArrayUsingBubbleSortALgorithm {

    public static void main(String[] args) {

        //ascending order
        int[] arr = {12, 7, 9, 3, 1, -2};

        for (int i = 0;  i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int k = 0; k < arr.length; k++) {
            System.out.println("Sorted elements " + arr[k]);
        }

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
