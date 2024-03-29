package commoninterviewtasks.interviewprograms;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        int num = 123954;

//        Logic 1: Converting to string
//        String str = String.valueOf(num);
//        int largest = Integer.parseInt(String.valueOf(str.charAt(0)));
//
//        for(int i = 0; i < str.length(); i++) {
//            if(Integer.parseInt(String.valueOf(str.charAt(i))) > largest) {
//                largest = Integer.parseInt(String.valueOf(str.charAt(i)));
//            }
//        }
//
//        System.out.println(largest);

//        Logic 2: Using % (modulo) and / (division) algorithm
        int largest = 0;

        while(num != 0) {
            int rem = num % 10;

            if(rem > largest) {
                largest = rem;
            }

            num = num / 10;

        }

        System.out.println(largest);






    }
}
