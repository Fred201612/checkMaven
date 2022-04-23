package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfBinary {

    public static void main(String[] args){
        String a = "0";
        String b = "0";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b){

        List<String> aList = new ArrayList<String>();

        List<String> bList = new ArrayList<String>();

        for (int i=0; i<a.length(); i++){
            aList.add(String.valueOf(a.charAt(a.length()-1-i)));
        }

        for (int i=0; i<b.length(); i++){
            bList.add(String.valueOf(b.charAt(b.length()-1-i)));
        }



        int maxLength = aList.size()>=bList.size()?aList.size():bList.size();

        if (aList.size() != maxLength){
            for (int i=aList.size(); i<maxLength; i++){
                aList.add("0");
            }
        }

        if (bList.size() != maxLength){
            for (int i=bList.size(); i<maxLength; i++){
                bList.add("0");
            }
        }

        List<String> cList = new ArrayList<String>();
        cList.add("0");

        List<String> result = new ArrayList<String>();


        for (int i=0; i<maxLength; i++){
            if (aList.get(i).equals("0") && bList.get(i).equals("0")){
                cList.add("0");
                result.add(cList.get(i));
            }else if (aList.get(i).equals("1") && bList.get(i).equals("1")){
                cList.add("1");
                result.add(cList.get(i));
            }else if (cList.get(i).equals("0")){
                cList.add("0");
                result.add("1");
            }else if (cList.get(i).equals("1")){
                cList.add("1");
                result.add("0");
            }
        }

        if (cList.get(cList.size()-1).equals("1")){
            result.add("1");
        }

        String newResult = "";
        for (int i=result.size()-1; i>=0; i--){
            newResult = newResult + result.get(i);
        }


        return newResult;
    }


}
