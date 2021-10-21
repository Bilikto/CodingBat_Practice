package com.company;

import java.util.Scanner;

public class Consonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter text");

        String text = scanner.nextLine();
//        char myChar = text.toLowerCase().charAt(0);

//        if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
//            System.out.println(myChar);
//        } else {
//            System.out.println(" It is not vowels");
//        }
        char myChar = ' ';
        for (int i = 0; i <= text.length() -1; i++) {
            myChar = text.toLowerCase().charAt(i);

            if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
                System.out.println(myChar);
            } else {
                System.out.println(myChar+ " is not vowels");
            }
        }

    }
}
