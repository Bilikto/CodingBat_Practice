package commoninterviewtasks.interviewprograms;

public class CountCharOccurrence {

    public static void main(String[] args) {

        String str = "Java programming language";

        // How many chars without spaces?
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(!Character.isSpaceChar(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("The given string has " + count + " chars");

        // How many 'a' chars in the string?
        //Logic 1: using loop
        int count2 = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                count2++;
            }
        }
        System.out.println("The given string has " + count2 + " 'a' chars");

        //Logic 2:
        int totalCount = str.length();
        int totalCount_afterRemoveChar = str.replaceAll("a", "").length();
        int totalCharCount = totalCount - totalCount_afterRemoveChar;
        System.out.println("Number of occurrences of char 'a' is " + totalCharCount);

    }
}
