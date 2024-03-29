package commoninterviewtasks;

public class CunturyFromYear {

    public static void main(String[] args) {
        int century = 0;
        int year = 1900;
        int temp = year;

        while(year > 0) {
            year = year - 100;
            century++;
        }

        System.out.println("The century of the year " + temp + " is " + century);
    }
}
