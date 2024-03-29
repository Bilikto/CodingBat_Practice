package commoninterviewtasks.interviewprograms;

public class FactorialOfANumber {
    public static void main(String[] args) {

//        A Factorial is a function that multiplies a number by every number below it.
//        Ex: 5!=5*4*3*2*1=120

//        Logic 1: Using for loop
        int num = 5;
        long factNum = 1; // if you assign here 0 it will remain as 0!

        for(int i = 1; i <= num; i++) {
            factNum *= i;
        }

        System.out.println("Factorial of a number " + num + " is " + factNum);

    }
}
