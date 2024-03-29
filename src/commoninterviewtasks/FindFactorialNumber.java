package commoninterviewtasks;

public class FindFactorialNumber {

    /*Factorial Program in Java:
    * Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!.
    * For example: 4! = 4*3*2*1 = 24 Or 5! = 5*4*3*2*1 = 120 */
    public static void main(String[] args) {
        int fact = 1;
        int number = 4;

        for(int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);

    }
}
