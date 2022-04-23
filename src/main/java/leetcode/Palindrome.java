package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s){

        List<String> stringList = new ArrayList<String>();

        for (int i=0; i<s.length(); i++){
            if ((int)s.charAt(i) >=97 && (int)s.charAt(i) <=122){
                stringList.add(String.valueOf(s.charAt(i)));
            }else if ((int)s.charAt(i) >=65 && (int)s.charAt(i) <=90){
                int change = (int)s.charAt(i)+32;
                char changeChar = (char)change;
                stringList.add(String.valueOf(changeChar));
            }else if ((int)s.charAt(i) >=48 && (int)s.charAt(i) <=57){
                stringList.add(String.valueOf(s.charAt(i)));
            }
        }

        List<String> newStringList = new ArrayList<String>();
        for (int i=0; i<stringList.size(); i++){
            newStringList.add(stringList.get(stringList.size()-1-i));
        }

        String oldString = "";
        for (int i=0; i<stringList.size(); i++){
            oldString = oldString + stringList.get(i);
        }

        String newString = "";
        for (int i=0; i<newStringList.size(); i++){
            newString = newString + newStringList.get(i);
        }


        if (oldString.equals(newString)){
            return true;
        }else {
            return false;
        }


    }
}
