package commoninterviewtasks;

public class AdjacentElementProds {


    public static void main(String[] args) {

//        Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

        // Logic 1:
        int[] arr = {1, 2, 1, 7, 3, 1000};

        int largeProd = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length-1; i++) {
            sum = arr[i] * arr[i+1];

            if(sum > largeProd) {
                largeProd = sum;
            }
        }


////        Logic 2: Math.max
//        int largeProd = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for(int i = 0; i < arr.length-1; i++) {
//            sum = arr[i] * arr[i+1];
//            largeProd = Math.max(sum, largeProd);
//        }
//
        System.out.println(largeProd);



    }
}
