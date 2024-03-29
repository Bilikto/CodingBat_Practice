package commoninterviewtasks.interviewprograms;

import java.util.Arrays;

public class FindSecondMaxInArray {

    public static void main(String[] args) {

        int[] arr = {5, 13, 3, 8, 1, 9, 11, 13, 13, 12};

        // Logic 1: Sort an array and pick the number at index n - 2. But it won't work if an array has 2 and more highest nums!
//        Arrays.sort(arr);
//        int secHighest = arr[arr.length-2];
//
//        System.out.println(secHighest);


        // Logic 2: Using an algorithm
        int highestNum = Integer.MIN_VALUE;
        int secondHighestNum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > highestNum) {
                secondHighestNum = highestNum;
                highestNum = arr[i];
            }

            if(arr[i] < highestNum && arr[i] > secondHighestNum) {
                secondHighestNum = arr[i];
            }
        }

        System.out.println("The second max number in the array is " + secondHighestNum);

    }
}
