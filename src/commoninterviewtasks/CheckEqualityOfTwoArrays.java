package commoninterviewtasks;

public class CheckEqualityOfTwoArrays {
    /*Java Program To Check Equality Of Two Arrays
    Logic:
    1. Compare length of array
    2. If length is same check each element of array
    3. If length not same the arrays are not same*/

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};
        boolean flag = true;

        if(arr1.length == arr2.length) {
            for(int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }

        if(flag) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

}
