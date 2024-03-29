package commoninterviewtasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numArray = {20, 30, 40, 50, 60};
        StringBuilder strBldr = new StringBuilder();

        for(int i = numArray.length-1; i >= 0; i--) {
            strBldr.append(numArray[i] + " ");
        }

        System.out.println("Reversed array using String builder " + strBldr);



        int[] reversedArr = new int[5];
        int j = numArray.length;

        for(int i = 0; i < numArray.length; i++) {
            reversedArr[i] = numArray[j-1];
            j--;
        }

        System.out.println("Reversed array using 1 more array " + Arrays.toString(reversedArr));

    }
}
