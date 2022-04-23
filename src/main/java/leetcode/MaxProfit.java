package leetcode;

public class MaxProfit {

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solve(prices));
    }

    public static int solve(int[] prices){

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i=0; i<prices.length; i++){
            if (prices[i] < minprice){
                minprice =prices[i];
            }else {
                maxprofit = (prices[i] - minprice) > maxprofit? (prices[i] - minprice) : maxprofit;
            }
        }

        return maxprofit;
    }
}
