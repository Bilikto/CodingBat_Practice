package commoninterviewtasks.interviewprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {

        String[] arr = {"Java", "C", "C#", "C++", "Python", "Java", "C#"};

        // Logic 1: Using Hashset
//        Set<String> uniqueElements =  new HashSet<>();
//        Set<String> duplicates =  new HashSet<>();
//
//        for(String val : arr) {
//            if(!uniqueElements.add(val)) {
//                duplicates.add(val);
//            }
//        }
//
//        System.out.println("Duplicate values " + duplicates);

        // Logic 2: Using 2 loops
        List<String> duplicates = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    duplicates.add(arr[i]);
                }
            }
        }

        System.out.println("Found duplicate elements " + duplicates);

    }
}
