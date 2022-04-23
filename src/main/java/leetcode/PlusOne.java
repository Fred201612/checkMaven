package leetcode;

public class PlusOne {

    public static void main(String[] args){
        int[] digits = {9};
        int[] finalGigits = solve(digits);
        System.out.println(finalGigits[1]);

    }

    public static int[] solve(int[] digits){

        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 0;
        for (int i=digits.length-1; i>=0; i--){
            newDigits[i+1] = digits[i];
        }

        int[] nums = new int[newDigits.length];

        nums[digits.length] = 1;

        for (int i=newDigits.length-1; i>=0; i--){
            if (newDigits[i] + nums[i] == 10){
                newDigits[i] = 0;
                nums[i-1] = 1;
            }else {
                newDigits[i] = newDigits[i] + nums[i];
            }
        }

        if (newDigits[0] == 0){
            for (int i=1; i<newDigits.length; i++){
                digits[i-1] = newDigits[i];
            }
            return digits;
        }else {
            return newDigits;
        }


    }
}
