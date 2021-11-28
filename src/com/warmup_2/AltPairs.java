package com.warmup_2;

public class AltPairs {
    public static void main(String[] args) {
        /*
        * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
        *
        * altPairs("kitten") → "kien"
        * altPairs("Chocolate") → "Chole"
        * altPairs("CodingHorror") → "Congrr"
        * */

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs("ThisThatTheOther"));

    }

    public static String altPairs(String str) {
        String s = "";
        for(int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            s += str.substring(i, end);
        }
//        for(int i = 0; i < str.length(); i++) {
//            switch(i) {
//                case 0:
//                    s+= str.charAt(i);
//                    break;
//                case 1:
//                    s+= str.charAt(i);
//                    break;
//                case 4:
//                    s+= str.charAt(i);
//                    break;
//                case 5:
//                    s+= str.charAt(i);
//                    break;
//                case 8:
//                    s+= str.charAt(i);
//                    break;
//                case 9:
//                    s+= str.charAt(i);
//                    break;
//                case 12:
//                    s+= str.charAt(i);
//                    break;
//                case 13:
//                    s+= str.charAt(i);
//                    break;
//            }
//        }
        return s;
    }
}
