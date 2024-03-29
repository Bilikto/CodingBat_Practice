package commoninterviewtasks.interviewprograms;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "abcd";

        // Logic 1: Using string concatenation

//        String revStr = "";
//        for(int i = str.length()-1; i >= 0; i--) {
//            revStr += str.charAt(i);
//        }

//        System.out.println("Reversed string: " + revStr);

        //Logic 2: Using character array
        String revStr = "";
        char[] charArr = str.toCharArray();

        for(int i = charArr.length-1; i >= 0; i--) {
            revStr += charArr[i];
        }

        System.out.println("Reversed string: " + revStr);


        //Logic 3: Using StringBuilder
//        StringBuilder strBldr = new StringBuilder(str);
//        strBldr.reverse();
//
//        System.out.println("Reversed string: " + strBldr);


    }
}
