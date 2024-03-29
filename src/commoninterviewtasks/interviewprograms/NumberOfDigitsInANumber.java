package commoninterviewtasks.interviewprograms;

public class NumberOfDigitsInANumber {

    public static void main(String[] args) {

        int num = 145678293; // 8 digits in the num

        // Logic 1: using string
//        String str = String.valueOf(num);
//        int count = 0;
//
//        for(int i = 0; i < str.length(); i++) {
//            count++;
//        }
//
//        System.out.println(num + " has " + count + " digits");


        // Logic 2: using an algorithm
        int count = 0;

        while(num != 0) {
            num = num / 10; // it will remove the last digits like --> 1st iteration 145678 becomes 14567 2nd --> 1456 --> 145 and so on till it becomes 0 (1/10 = 0)
            count++;
        }

        System.out.println("The number " + "has " + count + " digits");

    }

}



