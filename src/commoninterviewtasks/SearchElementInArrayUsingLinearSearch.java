package commoninterviewtasks;

public class SearchElementInArrayUsingLinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 1, 5, 6, 8, 2};
        int elementTobeSearched = 5;
        int index = 0;

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == elementTobeSearched) {
                flag = true;
                index = i;
            }
        }

        if(flag) {
            System.out.println("Search element is found " + elementTobeSearched + " at index " + index);
        }


    }
}
