package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GetRow {

    public static void main(String[] args){
        int rowIndex = 3;
        System.out.println(solve(rowIndex));
    }

    public static List<Integer> solve(int rowIndex){

        List<List<Integer>> threeTriangle = new ArrayList<List<Integer>>();



        for (int i=0; i<=rowIndex; i++){

            List<Integer> columnNumber = new ArrayList<Integer>();
            for (int j=0; j<=i; j++){

                if (j==0 || j==i){
                    columnNumber.add(1);
                }else {
                    columnNumber.add(threeTriangle.get(i-1).get(j-1) + threeTriangle.get(i-1).get(j));
                }
            }

            threeTriangle.add(columnNumber);
        }

        return threeTriangle.get(rowIndex);
    }
}
