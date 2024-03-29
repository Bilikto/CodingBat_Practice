package commoninterviewtasks.interviewprograms;

public class NumberOfEvenAndOddDigitsInANumber {

    public static void main(String[] args) {

        //Even numbers are those numbers that are completely divisible by 2. For example, 2, 4, 6, 8, 10, and so on are even numbers.

        // Logic: Using % (modulo) and / (division) operators
        int num = 145678923; // even = 3, odd = 3
        int temp = num;
        int lastNum = 0;
        int evenCount = 0;
        int oddCount = 0;

        while(num > 0) {
            lastNum = num % 10; //getting last number

            if(lastNum%2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
            num = num / 10;     //getting rid of the last number
        }

        System.out.println("The " + temp + " has " + evenCount + " even numbers");
        System.out.println("The " + temp + " has " + oddCount + " odd numbers");
    }
}
