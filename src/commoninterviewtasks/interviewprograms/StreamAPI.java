package commoninterviewtasks.interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);

//        nums.forEach(n -> System.out.println(n));

        // create Stream
//        Stream<Integer> data = nums.stream(); // returns Stream object
//        data.forEach(n -> System.out.println(n));
//        data.forEach(n -> System.out.println(n)); // IllegalStateException: stream has already been operated upon or closed! ---> you cannot reuse it!


        // return size of the stream
//        long count = data.count(); // 5
//        System.out.println(count);


        // sort stream. It returns a NEW sorted Stream
//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.out.println(n));


        // map the Stream
//        nums.stream()
//                .filter(n -> n % 2 != 0)
//                .sorted()
//                .map(n -> n * 2)
//                .forEach(n -> System.out.print(n+", "));


        // reduce() --> used to accumulate or sum the values
        int sumNum = nums.stream()
                .filter(n -> n%2 != 0) // 5, 1, 7 --> 10, 2, 14
                .sorted()
                .map(n -> n*2)
                .reduce(0, (sum, n) -> sum + n);

        System.out.println(sumNum);  // 26 --> 2 + 10 + 14


        // filter()
        List<String> str = Arrays.asList("Reflection","Collection","Stream", "Code", "Sun");

        str.stream()
                .filter(s->s.startsWith("C"))
                .forEach(n -> System.out.println(n+" ")); // Collection Code


        //collect() to List
        List<String> listRes = str.stream()
                .sorted()
                .collect(Collectors.toList()); // [Code, Collection, Reflection, Stream, Sun]

        System.out.println(listRes);


        //collect() to Set
        Set<String> setRes = str.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toSet());

        System.out.println(setRes); // [Stream, Sun]
        setRes.forEach(System.out::println);


        //collect() to Map
//        Map<Integer, String> mapRes = str.stream()
//                .map(... )
//                .collect(Collectors.toMap());

    }
}
