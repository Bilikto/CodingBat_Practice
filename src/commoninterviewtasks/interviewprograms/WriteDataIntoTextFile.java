package commoninterviewtasks.interviewprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {

//        Logic: Using FileWriter & BufferedWriter
        Writer fw = new FileWriter(System.getProperty("user.dir") + "/src/commoninterviewtasks/interviewprograms/text.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This line added by BufferedWriter class \n");
        bw.write("This line added by BufferedWriter class \n");
        bw.write("This line added by BufferedWriter class \n");

        System.out.println("Finished");
        bw.close();

    }
}
