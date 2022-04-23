package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExcelColumnNumber {

    public static void main(String[] args){
        String columnTitle = "ZY";

        System.out.println(solve(columnTitle));
    }

    public static int solve(String columnTitle){

        List<String> columnName = new ArrayList<String>();
        columnName.add("A");
        columnName.add("B");
        columnName.add("C");
        columnName.add("D");
        columnName.add("E");
        columnName.add("F");
        columnName.add("G");
        columnName.add("H");
        columnName.add("I");
        columnName.add("J");
        columnName.add("K");
        columnName.add("L");
        columnName.add("M");
        columnName.add("N");
        columnName.add("O");
        columnName.add("P");
        columnName.add("Q");
        columnName.add("R");
        columnName.add("S");
        columnName.add("T");
        columnName.add("U");
        columnName.add("V");
        columnName.add("W");
        columnName.add("X");
        columnName.add("Y");
        columnName.add("Z");

        double total = 0;
        for (int i=columnTitle.length()-1; i>=0; i--){
            double positionValue = columnName.indexOf(String.valueOf(columnTitle.charAt(i)))+1;
            double positionNumber = Math.pow(26,columnTitle.length()-1-i);
            total = total + positionValue * positionNumber;
        }

        return (int)total;
    }

}
