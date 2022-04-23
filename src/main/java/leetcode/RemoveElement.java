package leetcode;

public class RemoveElement {

    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(solve(nums,val));
    }

    public static int solve(int[] nums, int val){

        int max = 0;
        int min = 0;
        for (int element: nums){
            if (element != val){
                nums[min] = nums[max];
                min++;
            }
            max++;
        }

        return min;
    }
}
