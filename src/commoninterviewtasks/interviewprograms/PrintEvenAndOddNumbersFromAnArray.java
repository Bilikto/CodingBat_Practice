package commoninterviewtasks.interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenAndOddNumbersFromAnArray {

    public static void main(String[] args) {

        int[] numArr = {1, 2, 3, 4, 5, 6};

        // For loop
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] % 2 == 0) {
                evenList.add(numArr[i]);
            } else {
                oddList.add(numArr[i]);
            }
        }

        System.out.println("List of even numbers from the array " + evenList);
        System.out.println("List of odd numbers from the array " + oddList);


        // Enhanced for loop
//        System.out.println("Even numbers");
//        for(int num : numArr) {
//            if(num % 2 == 0) {
//                System.out.print(" " + num);
//            }
//        }
//
//        System.out.println();
//        System.out.println("Odd numbers");
//        for(int num : numArr) {
//            if(num % 2 != 0) {
//                System.out.print(" " + num);
//            }
//        }

    }
}
