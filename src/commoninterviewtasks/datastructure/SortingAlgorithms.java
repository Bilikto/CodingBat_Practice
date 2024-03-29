package commoninterviewtasks.datastructure;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arrNums = {7, 6, 3, 5, 1, 8, 2};

//        bubbleSorting(arrNums);
//        selectionSorting(arrNums);
        insertionSorting(arrNums);

    }

    // BUBBLE sorting (Big O(n2) --> quadratic algorithm) because we need to use 2 loops:
    // First for iterations
    // Second foe comparison
    private static void bubbleSorting(int[] nums) {
        int temp;
        System.out.println("Bubble sorting:");
        System.out.print("Before sorting " + Arrays.toString(nums));

        for(int i = 0; i< nums.length-1; i++) {        // nums1.length-1; means to skip the last iteration
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j]) {
                    continue;
                } else {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            //printing steps
            System.out.println();
            for(int n : nums) System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("After sorting " + Arrays.toString(nums));
        System.out.println();
    }


    // SELECTION sorting
    private static void selectionSorting(int[] nums) {
        int temp = 0;
        int minIndex = -1;
        System.out.println("Selection sorting:");
        System.out.print("Before sorting " + Arrays.toString(nums));

        for(int i = 0; i < nums.length-1; i++) {       // nums1.length-1; means to skip the last iteration
            minIndex = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            //printing steps
            System.out.println();
            for(int n : nums) System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("After sorting " + Arrays.toString(nums));
    }

    // INSERTION sorting
    private static void insertionSorting(int[] nums) {
        System.out.println("Insertion sorting:");
        System.out.print("Before sorting " + Arrays.toString(nums));

        for(int i = 1; i < nums.length; i++) { // starting form second element
            int key = nums[i];
            int j = i-1;                       // it is first element

            while(j >= 0 && nums[j] > key) {   // comparing with key
                nums[j+1] = nums[j];
                j--;                           // reduces j to 0
            }

            nums[j+1] = key;                  // here j becomes 0 at 1st iteration
        }

        System.out.println();
        System.out.println("After sorting " + Arrays.toString(nums));
    }

}
