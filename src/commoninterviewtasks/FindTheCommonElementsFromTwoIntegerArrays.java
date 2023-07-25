package commoninterviewtasks;

import java.util.ArrayList;
import java.util.List;

public class FindTheCommonElementsFromTwoIntegerArrays {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60,};

        List<Integer> commonElements = new ArrayList<>();

        for(int el1 : arr1) {
            for(int el2 : arr2) {
                if(el1 == el2) {
                    commonElements.add(el1);
                }
            }
        }

        System.out.println("Common elements from 2 arrays " + commonElements);
    }
}
