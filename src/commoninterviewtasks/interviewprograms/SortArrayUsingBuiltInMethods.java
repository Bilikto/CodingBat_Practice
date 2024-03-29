package commoninterviewtasks.interviewprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingBuiltInMethods {
    public static void main(String[] args) {

        int[] arr = {30, 60, 20, 70, 40, 50};

        // Logic 1: Arrays.parallelSort(arr)
//        System.out.println("Before sorting " + Arrays.toString(arr));
//        Arrays.parallelSort(arr);
//        System.out.println("After sorting " + Arrays.toString(arr));

        // Logic 2: Arrays.sort(arr)

//        System.out.println("Before sorting " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("After sorting " + Arrays.toString(arr));

        // Logic 3: Sort in Descending order!
        // In Arrays.sort you have to provide the second parameter --> "Collections.reverseOrder()" and the array should be a wrapper object!!! not primitive.
        Integer[] arr2 = {30, 60, 20, 70, 40, 50};
        System.out.println("Before sorting " + Arrays.toString(arr2));
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("After sorting " + Arrays.toString(arr2));
    }
}
