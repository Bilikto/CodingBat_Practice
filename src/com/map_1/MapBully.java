package com.map_1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {
        /*
        * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
        * Basically "b" is a bully, taking the value and replacing it with the empty string.
        *
        * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
        *
        * */

        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("a", "candy");
        strMap1.put("b", "dirt");

        Map<String, String> strMap2 = new HashMap<>();
        strMap2.put("a", "candy");

        Map<String, String> strMap3 = new HashMap<>();
        strMap3.put("a", "candy");
        strMap3.put("b", "carrot");
        strMap3.put("c", "meh");

        System.out.println(mapBully(strMap1));
        System.out.println(mapBully(strMap2));
        System.out.println(mapBully(strMap3));

    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
            return map;
        } else {
            return map;
        }
    }

}
