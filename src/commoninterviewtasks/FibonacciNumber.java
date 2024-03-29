package commoninterviewtasks;

public class FibonacciNumber {

    public static void main(String[] args) {

        /*
        * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
        * The first two numbers of fibonacci series are 0 and 1.
        *
        * There are two ways to write the fibonacci series program in java:
        *   Fibonacci Series without using recursion
        *   Fibonacci Series using recursion
        * */

        //Fibonacci Series without using recursion

        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;

        System.out.print(n1 + " " + n2);

        for(int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println();
        System.out.println("*******************************");

        // Fibonacci Series using recursion
        int num = 10;
        System.out.print(num1 + " " + num2);
        printFibonacci(num - 2);

    }

    static int num1 = 0;
    static int num2 = 1;
    static int num3 = 0;

    public static void printFibonacci(int num) {
       if(num > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
           System.out.print(" " + num3);
           printFibonacci(num - 1);
        }
    }
}


//        Q2
//        Given array holds the share prices {4,6,3,2,7,1}, the index+1 indicates the ith day, find the best day to buy and sell the stock
//        In the given data: Best day to buy is: 4th day and Best day to Sell is: 5th day . The Net profit is 5
//
//
//
//
//
//        Q3)
//        Check if the given word is a balanced word or not
//        i.e
//        If A=1 ,B=2 and C=3 ...  Z = 26
//        Split the word into 2 equal parts and find the sum of position of the character(s) present in both parts of the word.  If the sum is same it’s a balanced word else its not
//        EX : For a given Word "Venkat" split it into 2 equal parts and find the sum of the positions
//        VEN :  22+5+14= 41
//        KAT :  11+1+20 =32   / Not a balanced word.
//
//        String str = "Venkat";
//        String left = str.substring(0, str.length()/2);
//        String right = str.substring(str.length()/2);
//
//
//
//        for(int i = 0; i < str.length(); i++) {
//
//        if(i)
//        }

















