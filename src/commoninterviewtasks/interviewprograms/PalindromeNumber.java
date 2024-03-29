package commoninterviewtasks.interviewprograms;

public class PalindromeNumber {

    public static void main(String[] args) {

        /*A palindrome number is a number that remains the same when its digits are reversed*/

//        Logic 1: Using reverse number logic

        int num = 16461;
        int revNum = 0;
        int temp = num;

        while(num != 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(revNum);

        if(revNum == temp) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is NOT a palindrome number");
        }


    }
}
