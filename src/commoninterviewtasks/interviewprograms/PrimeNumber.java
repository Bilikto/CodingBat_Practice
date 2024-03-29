package commoninterviewtasks.interviewprograms;

import com.sun.xml.internal.bind.util.Which;

public class PrimeNumber {
    public static void main(String[] args) {
//        Prime number is:
//        1. Natural number > 1
//        2. Which has only 2 factors 1 and itself
//        Ex: 19 --> divisible by 1 and 19 --> is a Prime number
//        Ex: 2, 3, 5, 7, 11, 13, 17, 19..

        int num = 13;
        int count = 0;

        if(num > 1) {

            for(int i = 1; i <= num; i++)  {
                if(num % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
