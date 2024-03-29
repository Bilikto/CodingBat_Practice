package commoninterviewtasks.interviewprograms;

import java.time.Duration;
import java.time.LocalTime;

public class ConvertMinsToHrs {
    public static void main(String[] args) {

        // Logic 1: Using sting formatter
        String str = "260";
        int mins = Integer.parseInt(str);

        int h = mins / 60;
        int m = mins % 60;
        System.out.printf("%d:%02d", h, m);
        System.out.println();

        // Logic 2: using Duration class
        Duration d = Duration.ofMinutes(mins);
        System.out.println(d);
        long hours = d.toHours(); // extracting hrs
//        System.out.println(hours);
        long minutes = d.toMinutes() % 60; // extracting mins using modulo operator %
//        System.out.println(minutes);
        System.out.printf("%02d:%02d", hours, minutes); // formatting it to correct time
//        "%02d" means "format the integer with 2 digits, left padding it with zeroes",

        // Logic 3: Using LocalTime class
        System.out.println();
        LocalTime lt =LocalTime.MIN.plus(Duration.ofMinutes(mins));
        System.out.println(lt.toString());


    }

}
