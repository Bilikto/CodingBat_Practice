package com.array_1;

import java.sql.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//        Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0.
//        We'll do more complicated counting later, but for this problem the value is simply 0.
//
//
//        word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
//        word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
//        word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

public class Word0 {

    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "a", "b"};
        String[] arr2 = {"a", "b", "a", "c", "b"};
        String[] arr3 = {"c", "b", "a"};

        System.out.println(word0(arr1));
        System.out.println(word0(arr2));
        System.out.println(word0(arr3));

    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> mapData = new HashMap<>();
        for(String s : strings) {
            mapData.put(s, 0);
        }
        return mapData;
    }
}
