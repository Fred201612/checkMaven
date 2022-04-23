package leetcode;

public class SingleNumber {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};
        System.out.println(solve(nums));
    }

    public static int solve(int[] nums){

        int result = Integer.MAX_VALUE;

        for (int i=0; i<nums.length-1; i++){

            if (nums[i] == Integer.MAX_VALUE){
                continue;
            }

            for (int j=i+1; j<nums.length; j++){

                if (nums[j] == Integer.MAX_VALUE){
                    continue;
                }

                if (nums[i] == nums[j]){
                    nums[i] = Integer.MAX_VALUE;
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i] != Integer.MAX_VALUE){
                result = nums[i];
            }
        }
        return result;
    }
}
