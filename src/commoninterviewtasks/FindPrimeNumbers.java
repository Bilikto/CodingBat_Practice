package commoninterviewtasks;

public class FindPrimeNumbers {

    /*Prime number --> is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11)*/

    public static void main(String[] args) {

        for(int i = 2; i <= 50; i++) {
            if(isPrime(i) == true) {
                System.out.println("Prime number is " + i);
            }
        }

    }

    static boolean isPrime(int num) {
        int divisor = 0;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                divisor++;
            }
        }

        if(divisor == 0) {
            return true;
        } else {
            return false;
        }

    }
}
