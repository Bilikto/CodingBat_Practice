package commoninterviewtasks.interviewprograms;

public class FibonacciNumbers {
    public static void main(String[] args) {

//        Fibonacci number represents a number which is sum of previous 2 numbers

        int a = 0, b = 1;
        int sum = 0, num = 10;

        System.out.print("Fibonacci numbers of " + num + " --> ");
        for(int i = 2; i <= num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+ " ");
        }

    }
}
