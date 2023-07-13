package commoninterviewtasks;

public class FindDuplicateElementFromArrayUsingBruteForceAlgo {

    public static void main(String[] args) {
        /* Pick an indexed element and compare its value with values of the remaining elements. Repeat the same for all indexes
        it is called "Brute Force Algorithm". Try to void duplicate comparison! */

        int[] arr = {1, 2, 3, 4, 5, 6, 3, 4};

        for(int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println("The duplicate elements in array is " + arr[i]);
                }

            }

        }

        // If you want to find the first duplicate in array use label to break outer loop:
        outerLoop:
        for(int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println("The duplicate elements in array is " + arr[i]);
                    break outerLoop;
                }

            }

        }

    }

}
