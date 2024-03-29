package commoninterviewtasks.interviewprograms.sortingalgorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int searchEl = 30;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchEl) {
                System.out.println("The search element " + arr[i] + " found at index: " + i);
                break;
            }
        }

    }
}
