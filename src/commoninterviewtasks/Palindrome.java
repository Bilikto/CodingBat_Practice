package commoninterviewtasks;

public class Palindrome {

    /*Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
    It can also be a string like LOL, MADAM etc.*/

    public static void main(String[] args) {

        /*
        * Palindrome algorithm:
        * Get the number to check for palindrome
        * Hold the number in temporary variable
        * Reverse the number
        * Compare the temporary number with reversed number
        * If both numbers are same, print "palindrome number"
        * Else print "not palindrome number"
        */

        // Palindrome with Strings

        String palindrome = "mlm1";
        String temp = "";

        for(int i = palindrome.length()-1; i >= 0; i--) {
            temp += palindrome.charAt(i);
        }

        if(palindrome.equals(temp)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is NOT palindrome");
        }

        System.out.println(palindrome);
        System.out.println(temp);


        // Palindrome with numbers
        int palindromNum = 454;
        int tempNum = palindromNum;
        int r = 0;
        int sum = 0;

        while(palindromNum > 0) {
            r = palindromNum % 10;            // 1st iteration --> 4, 2nd --> 5, 3rd --> 4
            sum = (sum*10) + r;               //(0 * 10) --> 0 + 4 = 4 * 10 = 40 + 5 = 45 * 10 = 450 + 4 = 454!
            palindromNum = palindromNum/10;   // 1st iteration --> 45 (45.4 -> .4 removed by int!), 2nd --> 4 (4.54), 3rd --> 0 (0.4)
        }

        if(tempNum == sum) {
            System.out.println("Palindrome number " + tempNum);
        } else {
            System.out.println("It is not palindrome " + tempNum);
        }

        System.out.println(palindromNum);
        System.out.println(tempNum);
        System.out.println(sum);



        // Palindrome converting number to String
        int x = 121;
        String a = "" + x;
        String rev = "";
        for(int i = a.length()-1; i >= 0; i--) {
            rev += String.valueOf(a.charAt(i));
        }

        System.out.println(x);
        System.out.println(a);
        System.out.println(rev);

        if(rev.equals(a)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}

