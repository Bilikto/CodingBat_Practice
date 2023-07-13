package commoninterviewtasks;

public class FindTheSecondLargestNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {45, 51, 28, 75, 49, 42, 66, 101};

        if(arr.length < 2) {
            System.out.println("The array length is not ok for the second array");
        }

        int firstLargest;
        int secondLargest;

//        if an array contains 2 elements the logic is simple:
        if(arr[0] > arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

//        if an array contains 3 and more elements the logic is:
        for(int i = 2; i < arr.length; i++) {

            if(arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if(arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest in tha array is " + secondLargest);

    }
}
