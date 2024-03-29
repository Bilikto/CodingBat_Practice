package commoninterviewtasks.interviewprograms;

public class CountWordsInString {

    public static void main(String[] args) {

        String str = "Welcome to Java";

        // Logic 1: Using .split() method
//        String[] arr = str.split(" ");
//        System.out.println(arr.length);


        // Logic 2: Using loop
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')) {
                count++;
            }
        }

        System.out.println("The string contains " + count + " words");

    }
}
