package com.map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {

    public static void main(String[] args) {
        /*
        * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
        * If both keys are present, append their 2 string values together and store the result under the key "ab".
        * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        * mapAB({"a": "Hi"}) → {"a": "Hi"}
        * mapAB({"b": "There"}) → {"b": "There"}
        * */

        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("a", "Hi");
        strMap1.put("b", "There");
        Map<String, String> strMap2 = new HashMap<>();
        strMap2.put("a", "Hi");
        Map<String, String> strMap3 = new HashMap<>();
        strMap3.put("b", "There");

        System.out.println(mapAB(strMap1));
        System.out.println(mapAB(strMap2));
        System.out.println(mapAB(strMap3));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
