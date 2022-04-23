package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamePreStr {

    public static void main(String[] args){


        String[] strs = {"babb","caa"};
        List<String> strsList = Arrays.asList(strs);
        List arrlist = new ArrayList(strsList);

        int length = getMinLength(arrlist);
        while (arrlist.size()>1){
            String a = compareTwoString(arrlist.get(0).toString(),arrlist.get(1).toString(), length);
            arrlist.remove(0);
            arrlist.set(0,a);
        }



        strs = (String[])arrlist.toArray(new String[arrlist.size()]);

        System.out.println(strs[0].trim());

    }

    private static int getMinLength(List<String> strsList){
        int length = 200;
        for (int i=0; i<strsList.size(); i++){
            length = strsList.get(i).length()<length ? strsList.get(i).length() : length;

        }
        return length;
    }

    private static String compareTwoString(String s1, String s2, int length){
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        char[] finalString = new char[length];
        if (s1.length() == 0 || s2.length() ==0){
            return "";
        }
        for (int i=0; i<length; i++){
            if (s1Char[i] == s2Char[i]){
                finalString[i] = s1Char[i];
            }else if (s1Char[i] != s2Char[i] && i !=0){
                for (int j=0; j<i-1; j++){
                    finalString[j] = s1Char[j];
                }
                break;
            }else {
                return "";
            }
        }
        return String.valueOf(finalString);
    }
}
