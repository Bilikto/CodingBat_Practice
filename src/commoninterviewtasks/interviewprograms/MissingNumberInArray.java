package commoninterviewtasks.interviewprograms;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {

        /*In order to find missing number the array must maintain the following requirements:
        * 1. Array should not have duplicates
        * 2. Array no need to be in sorted order
        * 3. Values should be in range!!! */

//        Logic: The missing number in the below array is 3. How to find it?
//        int sum1 = 1 + 2 + 4 + 5 = 12
//        int sum2 = 1 + 2 + 3 + 4 + 5 = 15
//        int missingNum = sum2 - sum1;

        int[] arr = {1, 5, 4, 2};
        Arrays.sort(arr);

        int sum1 = 0;
        int sum2 = 0;
        int missingNum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        System.out.println("Sum of elements in array is " + sum1);

        for(int j = 1; j <= arr[arr.length-1]; j++) {
            sum2 += j;
        }

        System.out.println("Sum of range " + sum2);

        missingNum = sum2 - sum1;

        System.out.println("The missing number in array is " + missingNum);

    }
}
