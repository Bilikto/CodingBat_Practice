package commoninterviewtasks;

public class FindAreaOfPolygon {

    public static void main(String[] args) {

        //Logic: Use formula (n^2) + ((n-1) + (n-1)) --> n^2 is a square of the number (is the same as n multiplied by itself).
//        ex: if n=2 --> 5; 2*2=4  5-4=1 --> 4 + 1 = 5
//            if n=3 --> 13; 3*3=9  13-9=4 --> 9 + 4 = 13!
        int n = 3;
        int area = 0;

        area = (n*n) + ((n-1) * (n-1));

        System.out.println("The area of polygon is " + area);

    }
}
