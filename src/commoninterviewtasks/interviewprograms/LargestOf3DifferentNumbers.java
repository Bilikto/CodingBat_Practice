package commoninterviewtasks.interviewprograms;

public class LargestOf3DifferentNumbers {

    public static void main(String[] args) {

        int a = 100, b = 300, c = 700;

//        Logic 1: Using comparison
//        int largest = 0;
//
//        if(a > b && a > c) {
//            largest = a;
//        } else if(b > a && b > c) {
//            largest = b;
//        } else {
//            largest = c;
//        }
//
//        System.out.println("Tha largest number is = " + largest);


//        Logic 2: Using a ternary operator
        int largest = a > (b > c ? b : c)? a : (b > c ? b : c);
        System.out.println("Tha largest number is = " + largest);

//        Logic 3: Using Math.max() method
//        int largest = Math.max(c, (a > b ? a : b));
//        System.out.println("Tha largest number is = " + largest);

    }
}
