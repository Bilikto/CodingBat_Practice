package commoninterviewtasks.interviewprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReverseEachWord {

    public static void main(String[] args) {

        String s = "Welcome 1 to 2 Java";

        //Logic 1: Using 2 loops
        String[] arr = s.split(" ");
        String res = "";

        for(int i = 0; i < arr.length; i++) {
            String word = "";
            for(int j = arr[i].length()-1; j >= 0; j--) {
                word += arr[i].charAt(j);
            }
            res += word + " ";
        }

        System.out.println(res);


        //Logic 1: Using StringBuilder
//        String[] arr = s.split("\\s");
//        String res = "";
//
//        for(String w : arr) {
//            StringBuilder sb = new StringBuilder(w);
//            sb.reverse();
//            res += sb + " ";
//        }
//
//        System.out.println(res);

    }
}
