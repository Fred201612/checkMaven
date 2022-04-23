package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ExcelColumnName {

    public static void main(String[] args){

        int columnNumber = 52;
        System.out.println(convertToColumnName(columnNumber));
    }

    public static String convertToColumnName(int columnNumber){


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


        List<String> finalColumnName = new ArrayList<String>();
        while(columnNumber>26){

            if (columnNumber%26 == 0){
                finalColumnName.add("Z");
                columnNumber = (columnNumber-1)/26;
            }else {
                finalColumnName.add(columnName.get(columnNumber%26-1));
                columnNumber = columnNumber/26;
            }


        }

        finalColumnName.add(columnName.get(columnNumber-1));



        String finalString = "";
        for (int i=finalColumnName.size()-1; i>=0; i--){
            finalString = finalString + finalColumnName.get(i);
        }



        return finalString;
    }
}
