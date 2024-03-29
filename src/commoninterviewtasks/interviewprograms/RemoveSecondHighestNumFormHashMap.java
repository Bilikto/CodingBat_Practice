package commoninterviewtasks.interviewprograms;

import java.util.*;

public class RemoveSecondHighestNumFormHashMap {

    public static void main(String[] args) {

        //Logic 1
        // Using ArrayList and Collections.sort
//        Map<String, Integer> mapNums = new HashMap<>();
//        mapNums.put("b", 12);
//        mapNums.put("c", 8);
//        mapNums.put("a", 10);
//        mapNums.put("e", 9);
//        mapNums.put("d", 11);
//        mapNums.put("f", 12);
//        System.out.println("Hashmap before removing second highest value --> " + mapNums);
//
//        //sorted by value
//        List<Integer> listNums = new ArrayList<>(mapNums.values());
//        Collections.sort(listNums);
//        System.out.println("Sorted list " + listNums);
//
//        //logic to find the second highest value
//        int highestNum = 0;
//        int secHighestNum = 0;
//
//        for(int i = 0; i < listNums.size(); i++) {
//            if(listNums.get(i) > highestNum ) {
//                secHighestNum = highestNum;
//                highestNum = listNums.get(i);
//            }
//        }
//        System.out.println("Second highest value from hashmap "+ secHighestNum);
//
//        //A new hashMap without the second highest value
//        Map<String, Integer> newMapNums = new HashMap<>();

//        for(Map.Entry<String, Integer> e : mapNums.entrySet()) {
//            if(e.getValue() == secHighestNum) {
//                continue;
//            }
//            newMapNums.put(e.getKey(), e.getValue());
//        }
//
//        System.out.println("Hashmap after removing second highest value --> " + newMapNums);

//        System.out.println();


        //Logic 2
        // Using Lambda and Java Stream
        Map<String, Integer> mapNums = new HashMap<>();
        mapNums.put("b", 12);
        mapNums.put("c", 8);
        mapNums.put("a", 10);
        mapNums.put("e", 9);
        mapNums.put("d", 11);
        mapNums.put("f", 12);
        System.out.println("Hashmap before removing second highest value --> " + mapNums);

        //The logic to sort and find the second highest value
        Map.Entry<String, Integer> m = mapNums.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .skip(2)     // skipping two -> 12
                .findFirst()
                .get();

        System.out.println("The second highest value in hashMap is " + m.getValue());

        Map<String, Integer> newMapNums = new HashMap<>();
        for(Map.Entry<String, Integer> d : mapNums.entrySet()) {
            if(d.getValue() == m.getValue()) {
                continue;
            }
            newMapNums.put(d.getKey(), d.getValue());
        }

        System.out.println("Hashmap after removing second highest value --> " + newMapNums);


        //Logic 3
        // Remove second highest number from an Array
//        int[] nums = {3, 8, 5, 10, 9, 7};
//        Arrays.sort(nums);
//
//        int highest = Integer.MIN_VALUE;
//        int secHighest = Integer.MIN_VALUE;
//
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] > highest) {
//                secHighest = highest;
//                highest = nums[i];
//            }
//        }
//
//        System.out.println("The second highest value from an array --> " +secHighest);
//
//        int[] anotherNums = new int[nums.length-1];
//
//        for(int i = 0, k = 0; i < nums.length; i++) {
//            if(nums[i] == secHighest) {
//               continue;
//            }
//            anotherNums[k++] = nums[i];
//        }
//
//        System.out.println("A new array after removing the second highest value --> "+Arrays.toString(anotherNums));

    }
}
