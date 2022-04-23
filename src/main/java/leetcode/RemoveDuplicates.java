package leetcode;

public class RemoveDuplicates {

    public static void main(String[] args){

        int[] nums = {1,1,2};
        System.out.println(solve(nums));
    }

    public static int solve(int[] nums){

        for (int i=0; i<nums.length-1; i++){
            while (nums[i] == nums[i+1] && nums[i] != nums[nums.length-1]){
                for (int j=i+1; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
            }
        }

        int index = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == nums[nums.length-1]){
                index = i +1;
                break;
            }
        }

        return index;
    }
}
