package commoninterviewtasks.interviewprograms;

public class RemoveWhiteSpacesInString {
    public static void main(String[] args) {

        String str = "Java       is a programming       language";

        // Logic: Using Regular expression "\\s" spaces
        str = str.replaceAll("\\s", "");
//        str = str.replaceAll(" ", "");

        System.out.println(str);

    }
}
