package commoninterviewtasks.interviewprograms;

public class VowelsInString {

    public static void main(String[] args) {
        /*
        Vowels --> ‘a’, ‘e’, ‘i’, ‘o’, ‘u’;
        Consonants --> ‘b’, ‘c’, ‘d’, ‘f’, ‘g’ ‘h’, ‘j’, ‘k’, ‘l’, ‘m’ ...;
         */
        String str = "This is a really simple sentence";
        str = str.toLowerCase();
        int vCount = 0;
        int cCount = 0;

        for(int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }

        System.out.println("In the given string \"" + str + "\" there are " + vCount + " vowels");
        System.out.println("In the given string \"" + str + "\" there are " + cCount + " consonants");


    }
}
