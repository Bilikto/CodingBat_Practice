package commoninterviewtasks.interviewprograms;

import java.util.Arrays;

public class Check2ArraysAreEqualOrNot {
    public static void main(String[] args) {


//        Logic 1: Using Array.equals(arr1, arr2) method
//        Two arrays are equal if they contain the same elements in the same order.
//        Also, two array references are considered equal if both are null!!!

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
//        int[] arr1 = null;
//        int[] arr2 = null;

//        System.out.println(Arrays.equals(arr1, arr2));


//        Logic 2: Using logic
        boolean status = true;

        if(arr1.length == arr2.length) {

            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    status = false;
                }
            }

        } else {
            status = false;
        }

        if(status) {
            System.out.println("The 2 arrays are equal" );
        }else {
            System.out.println("The 2 arrays are not equal" );
        }

    }
}
