package commoninterviewtasks.interviewprograms;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {

        // Logic 1: Using FileReader and BufferedReader
        Reader fr = new FileReader(System.getProperty("user.dir") + "/src/commoninterviewtasks/interviewprograms/text.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;

        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();


        // Logic 2: Using Scanner & File classes with loop
        File file = new File(System.getProperty("user.dir") + "/src/commoninterviewtasks/interviewprograms/text.txt");
        Scanner sc = new Scanner(file);
        String content;

        while(sc.hasNextLine()) {
            content = sc.nextLine();
            System.out.println(content);
        }

        sc.close();


        // Logic 3: Using Scanner & File classes without loop!
//        File file = new File(System.getProperty("user.dir") + "/src/commoninterviewtasks/interviewprograms/text.txt");
//        Scanner sc = new Scanner(file);
//        sc.useDelimiter("\\Z");
//        System.out.println(sc.next());
//        sc.close();

    }
}
