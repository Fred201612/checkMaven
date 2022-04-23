package leetcode;

public class Merge {

    public static void main(String[] args){
        int[] num1 = {4,5,6,0,0,0};
        int m = 3;
        int[] num2 = {1,2,3};
        int n = 3;
        solve(num1,m,num2,n);
        for (int i=0; i<num1.length; i++){
            System.out.println(num1[i]);
        }

    }

    public static void solve(int[] nums1, int m, int[] nums2, int n){

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (nums2[i] <= nums1[j]){
                    for (int k=m-1; k>=j; k--){
                        nums1[k+1] = nums1[k];
                    }
                    nums1[j] = nums2[i];
                    m++;
                    break;
                }
            }

        }

        for (int k=m; k<nums1.length; k++){
            nums1[k] = nums2[n-nums1.length+m];
            m++;
        }

    }
}
