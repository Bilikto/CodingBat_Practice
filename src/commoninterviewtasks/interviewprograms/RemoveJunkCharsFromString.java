package commoninterviewtasks.interviewprograms;

public class RemoveJunkCharsFromString {

    public static void main(String[] args) {

        String str = "[01;31[ACTIVE[MA[=N-1";

//        Logic 1: Using Regular expression
//        Reg exp: [a-zA-Z0-9] -->      [;[[[=-
//                 [^a-zA-Z0-9] -->     0131mKINACTIVEmK1
//                  ^ --> means except
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

    }
}
