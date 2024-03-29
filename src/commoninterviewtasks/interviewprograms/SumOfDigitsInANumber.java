package commoninterviewtasks.interviewprograms;

public class SumOfDigitsInANumber {

    public static void main(String[] args) {

        int num = 12345; //15

//        Logic 1: Using string
//        String str = String.valueOf(num);
//        int sum = 0;
//
//        for(int i = 0; i < str.length(); i++) {
//            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//        }
//
//        System.out.println(sum);

//        Logic 2: Using % (modulo) and / (division) algorithm

        int sum = 0;
        while(num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println("The sum of the provided numbers is " + sum);

    }
}
