package commoninterviewtasks.interviewprograms;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class HowToGenerateRandomNumbersAndStrings {

    public static void main(String[] args) {
//        There are 3 ways to generate random Numbers and Strings:
//          1. Using Random java class
//          2. Using Math class
//          3. Using Apache-common-lang API (don`t forget to download --> commons-lang3-3.14.0.jar file)



        //1:
        Random rand = new Random();
        int randInt = rand.nextInt(10); // it returns random number in a range from 0 to 9
        System.out.println(randInt);

        double randDbl = rand.nextDouble(); // it returns random value in a range from 0.0 to 1.0
        System.out.println(randDbl);

        //2:
//        System.out.println(Math.random());

        //3:
        String randNum = RandomStringUtils.randomNumeric(5); // parameter is how many digits it should return
        System.out.println(randNum);

        String randStr = RandomStringUtils.randomAlphabetic(7); // parameter is how many chars it should return
        System.out.println(randStr);

    }


}
