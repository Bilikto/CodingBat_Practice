package com.map_1;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

/*  Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
    Return the empty string if no string appears a 2nd time.

    wordAppend(["a", "b", "a"]) → "a"
    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    wordAppend(["a", "", "a"]) → "a" */

    public static void main(String[] args) {
        String[] str1 = {"a", "b", "a"};
        String[] str2 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] str3 = {"a", "", "a"};

        System.out.println(wordAppend(str1));
        System.out.println(wordAppend(str2));
        System.out.println(wordAppend(str3));
    }


    public static String wordAppend(String[] strings) {
        Map<String, Integer> mapData = new HashMap<String, Integer>();
        String str = "";

        for(int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if(!mapData.containsKey(s)) {
                mapData.put(s, 1);
            } else {
                int count = mapData.get(s);
                mapData.put(s, count + 1);

                if(mapData.get(s) != 1 && mapData.get(s) % 2 == 0) {
                    str += s;
                }
            }
        }
        return str;
    };

}
