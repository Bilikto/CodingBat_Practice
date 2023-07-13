package commoninterviewtasks;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class FindFrequencyOfEachWords {

    public static void main(String[] args) {
        String str = "Java is robust java is portable java is fun";
        String[] arr = str.toLowerCase().split(" ");
        Map<String, Integer> frequency = new HashMap<>();

        for(String s : arr) {
            if(!frequency.containsKey(s)) {
                frequency.put(s, 1);
            } else {
                int prev = frequency.get(s);
                frequency.put(s, prev + 1);
            }
        }

        Set<Map.Entry<String, Integer>> pairSet = frequency.entrySet();

        for(Map.Entry<String, Integer> entry : pairSet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
