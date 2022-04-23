package leetcode;

public class SearchInsert {

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(solve(nums,target));
    }

    public static int solve(int[] nums, int target){

        int index = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] < target && i != nums.length-1){
                continue;
            }else if (nums[i] < target && i == nums.length-1){
                index = nums.length;
                break;
            } else {
                index = i;
                break;
            }
        }

        return index;
    }
}
