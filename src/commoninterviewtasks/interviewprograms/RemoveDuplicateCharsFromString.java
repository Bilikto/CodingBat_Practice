package commoninterviewtasks.interviewprograms;

import java.util.*;

public class RemoveDuplicateCharsFromString {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        //Using HashSet or LinkedHashset
//        Set<Character> setOfChars = new LinkedHashSet<>();
//
//        for(int i = 0; i < str. length(); i++) {
//            setOfChars.add(str.charAt(i));
//        }
//
//        setOfChars.forEach(System.out::print);


//        System.out.println();


        //Using 2 Loops
        char[] arr = str.toCharArray();
        char index = 0;

        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    break;
                }
            }

            if(j == i) {
                arr[index++] = arr[i];
            }

        }

        char[] a = Arrays.copyOf(arr, index);
        System.out.println(Arrays.toString(a));
        System.out.println(String.valueOf(a));

    }
}
