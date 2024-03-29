package commoninterviewtasks.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Drawable {
    void draw();
}

public class LambdaExpression {
    public static void main(String[] args) {
        int width = 10;

        // Without Lambda
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing " + width);
//            }
//        };
//        d.draw();


        // With Lambda
        Drawable d = () -> System.out.println("Drawing " + width);
        d.draw();


        //For EachLoop with lambda
        List<String> cities = new ArrayList<>();
        cities.add("Washington");
        cities.add("New York");
        cities.add("Atlanta");
        cities.add("Birmingham");

        cities.forEach((n) -> System.out.println(n));


        List<String> months = Arrays.asList("Jan", "Feb", "Mar", "Apr");
        months.forEach(m -> System.out.print(m+" "));

    }
}
