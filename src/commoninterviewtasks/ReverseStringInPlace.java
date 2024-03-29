package commoninterviewtasks;

import java.util.Arrays;

public class ReverseStringInPlace {

    public static void main(String[] args) {

        String str = "This2Is9Common";
        String[] arrWords = str.split("\\d+");
        String revString = "";

        for(int i = 0; i < arrWords.length; i++) {
            String word = arrWords[i];
            String revWord = "";

            for(int j = word.length()-1; j >= 0; j--) {
                revWord += word.charAt(j);
            }

            revString += revWord + " ";
        }

        System.out.println(revString);
    }
}
