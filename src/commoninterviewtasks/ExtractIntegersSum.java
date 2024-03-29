package commoninterviewtasks;

public class ExtractIntegersSum {
    public static void main(String[] args) {

        //Task 1
        String input = "a1b2c3d4e5jkl8";
        int sum = 0;

        for(int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))) {
                sum += Character.getNumericValue(input.charAt(i));
            }
        }
        System.out.println(sum); //23


        //Task 2
        String input2 = "a1b2c3kkk781l2";
        String res = "";

        for(int i = 0; i < input2.length(); i++) {
            if(Character.isDigit(input2.charAt(i))) {
                int a = Character.getNumericValue(input2.charAt(i));
                int b = 0;
                if(!Character.isDigit(input2.charAt(i-1))) {
                    while(b < a) {
                        res += String.valueOf(input2.charAt(i-1));
                        b++;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
