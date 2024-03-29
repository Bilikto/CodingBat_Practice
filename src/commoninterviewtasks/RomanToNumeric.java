package commoninterviewtasks;

public class RomanToNumeric {
    public static void main(String[] args) {

        System.out.println(romanToInt("XXX"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MMXXIII"));
        System.out.println(romanToInt("LC")); // 50 because of -50 + 100 = 50
        System.out.println(romanToInt("CL")); // 150 because of +50 + +100 = 150
        System.out.println(romanToInt("IL")); // 49
        System.out.println(romanToInt("XXXXIX")); // 49
        System.out.println(romanToInt("XLIX")); // 49

    }

    public static int romanToInt(String s) {
        int res = 0;
        int curr = 0;
        int prev = 0;

        for(int i = 0; i < s.length()-1; i++) {
            char a = s.charAt(i);

            if(a == 'I' && s.charAt(i+1) != 'V' || s.charAt(i+1) != 'X') {
                System.out.println("The wrong Roman number format");
            } else if(a == 'X' && s.charAt(i+1)!= 'L' || s.charAt(i+1) != 'C') {
                System.out.println("The wrong Roman number format");
            } else if(a == 'C' && s.charAt(i+1) != 'D' || s.charAt(i+1) != 'M') {
                System.out.println("The wrong Roman number format");
            }
        }

        for(int i = s.length()-1; i >= 0; i--) {
            char b = s.charAt(i);

            switch(b) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }

            if(curr < prev) {
                res -= curr;
            } else {
                res += curr;
            }
            prev = curr;
        }
        return res;
    }
}
