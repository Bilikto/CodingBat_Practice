package commoninterviewtasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));

        Set<String> setOfWords = new HashSet<>();
        Set<String> setOfDuplicates = new HashSet<>();

        for(String word : arr) {
            if(!setOfWords.add(word)) {
                setOfDuplicates.add(word);
            }
        }

        System.out.println("Duplicate words " + setOfDuplicates);
        System.out.println("Duplicate words " + setOfWords);
    }
}
