package commoninterviewtasks;

public class FindMaximumNumberFromAnArray {

    public static void main(String[] args) {
        int[] nums = {1, 6, 22, 33, 54, 99, 88, 67, 100, 27, 16};
        int maxNum = nums[0];

        for(int num : nums) {
            if(num > maxNum) {
                maxNum = num;
            }
        }

        System.out.println("The max number of the given array is " + maxNum);
    }
}
