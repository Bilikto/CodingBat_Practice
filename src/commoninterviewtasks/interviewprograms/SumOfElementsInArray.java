package commoninterviewtasks.interviewprograms;

public class SumOfElementsInArray {

    public static void main(String[] args) {

        int[] numArr = {5,2,7,9,6};
        int sum = 0;

        // Suing for loop
//        for(int i = 0; i < numArr.length; i++) {
//            sum += numArr[i];
//        }
//
//        System.out.println("The sum of elements in array is " + sum);


        // Using enhanced for loop
        for(int num : numArr) {
            sum += num;
        }

        System.out.println("The sum of elements in the array is " + sum);

    }
}
