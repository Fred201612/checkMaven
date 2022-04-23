package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Generate {

    public static void main(String[] args){
        int numRows = 1;

        List<List<Integer>> threeTriangle1 = new ArrayList<List<Integer>>();
        threeTriangle1 = sovle(numRows);
        for (int i=0; i<threeTriangle1.size(); i++){
            System.out.println(threeTriangle1.get(i));
        }
    }

    public static List<List<Integer>> sovle(int numRows){

        List<List<Integer>> threeTriangle = new ArrayList<List<Integer>>();



        for (int i=0; i<numRows; i++){

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

        return threeTriangle;
    }


}
