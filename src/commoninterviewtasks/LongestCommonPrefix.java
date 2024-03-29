package commoninterviewtasks;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*Write a function to find the longest common prefix string amongst an array of strings.
      If there is no common prefix, return an empty string "".

    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"*/

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight","florida"};
        System.out.println(Arrays.toString(strs));

        String res = findCommonLongestPrefix(strs);
        System.out.println("The result - " + res);
    }

    public static String findCommonLongestPrefix(String[] strs) {
        int left = 0;
        int right = strs.length-1;
        int i = 0;
        String result = "";

        while(left < right) {

            if(strs[left].charAt(i) == strs[right].charAt(i)) {
                System.out.println(strs[left]);
                System.out.println(strs[right]);
                result += strs[left].charAt(i);
            } else {
                i = 0;
                System.out.println(i);
            }

            i++;
            left++;

        }
        System.out.println(i);
        return result;





//        String left = strs[0];
//        String right = strs[strs.length-1];
//        int ind = 0;
//        int a = 0;
//
//        while(a < strs.length) {
//            if(left.charAt(ind) == right.charAt(ind)) {
//                System.out.println(left);
//                System.out.println(right);
//                ind++;
//            }
//            a++;
//        }
//
//        return left.substring(0, ind);
    }

}
