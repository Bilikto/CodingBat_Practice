package commoninterviewtasks.interviewprograms;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("Before swapping: " + a + " " + b);

        // Logic 1 --> Using temp variable
//        int temp = a;
//        a = b;
//        b = temp;

        // Logic 2 --> using + and -
//        a = a + b;
//        b = a - b;
//        a = a - b;


        // Logic 3 --> A single statement
        b = a + b - (a = b);

        System.out.println("After swapping: " + a + " " + b);
    }
}
