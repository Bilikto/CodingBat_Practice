package commoninterviewtasks.interviewprograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Number:");
        int num = sc.nextInt(); //1234 --> 4321

//        Logic 1 --> using StringBuilder
//        StringBuilder revNum = new StringBuilder();
//        revNum.append(num);
//        revNum.reverse();
//        System.out.println(revNum);


//        Logic 2: --> using StringBuffer
//        StringBuffer revNum = new StringBuffer(String.valueOf(num));
//        System.out.println(revNum.reverse());


//        Logic 3: Using algorithm
        int revNum = 0;

        while(num != 0) {
            revNum = revNum * 10 + num % 10; // --> getting the last digit
            num = num / 10;                  // removing the last digit because num type is int. It will save integer value only, not decimal part.
        }

        System.out.println(revNum);

    }
}
