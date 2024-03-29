package commoninterviewtasks.interviewprograms;

import java.util.Arrays;

public class PalindromeString {

    public static void main(String[] args) {

        /*A palindrome string is a string that remains the same when its characters are reversed*/

        // Logic 1: reversing string

        String str = "madam";
        String revStr = "";

        for(int i = str.length()-1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        if(revStr.equals(str)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is NOT a palindrome string");
        }

    }
}
