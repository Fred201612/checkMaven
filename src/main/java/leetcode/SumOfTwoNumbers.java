package leetcode;

public class SumOfTwoNumbers {

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        for (int i=0; i<2; i++){
            System.out.println(solve(nums, target)[i]);
        }

    }

    public static int[] solve(int[] nums, int target){

        int[] result = new int[2];

        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;

    }
}
