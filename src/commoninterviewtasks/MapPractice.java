package commoninterviewtasks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("Joe", "Biden");
        names.put("Donald", "Trump");
        names.put("Barak", "Obama");

        //Print keys
        Set<String> keys = names.keySet();

        for(String key : keys) {
            System.out.println(key);
        }

        System.out.println("================================================");

        //Print values
        Collection<String> val = names.values();

        for(String v : val) {
            System.out.println(v);
        }

        System.out.println("================================================");

        //Print keys and values
        Set<Map.Entry<String, String>> data = names.entrySet();

        for(Map.Entry<String, String> a : data) {
            System.out.println(a);
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }




    }
}
