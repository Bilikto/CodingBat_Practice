package commoninterviewtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetrieveDistinctNumberFromArray {

    public static void main(String[] args) {

//     LPL Financial
//        Q1)
//        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
//
//        Sum of N Numbers = N(N+1) %2
//        1 to 10 sum = 10*11 % 2 = 110/ 2 =55 (1+2+3+4+5+6+7+9+10)= 55 47-55 ==8

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(returnMissingNumber(arr));
    }

    public static int returnMissingNumber(int[] numArr) {
        int missingNum = 0;
        int sum = 0;
        int temp = 0;

        Arrays.sort(numArr);

        for(int i = 1; i <= numArr[numArr.length-1]; i++) {
            sum += i;
        }

        for (int i : numArr) {
            temp = temp + i;
        }

        System.out.println(temp);

        if(temp != sum) {
            missingNum = sum - temp;
            return missingNum;
        } else {
            System.out.println("The array has all numbers");
            return -1;
        }





    }
}
