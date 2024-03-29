package commoninterviewtasks.interviewprograms;

public class FindMaxAndMinValueInArray {

    public static void main(String[] args) {

        //Find Max value
        int[] arr1 = {60, 30, 20, 50, 40};

        int max = Integer.MIN_VALUE;

        for(int n : arr1) {
            if(n > max) max = n;
        }

        System.out.println("The max value in the array is " + max);



        //Find Min value
        int min = Integer.MAX_VALUE;

        for(int n : arr1) {
            if(n < min) min = n;
        }

        System.out.println("The min value in the array is " + min);
    }
}
