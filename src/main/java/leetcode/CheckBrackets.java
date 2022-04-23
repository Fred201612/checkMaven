package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckBrackets {

    public static void main(String[] args){

//        byte a = 1;
//        short b = 5;
//        int c = 0;
//        long d = 111;
//        float e = 222;
//        double f = 3.33;
//        char g = 'c';
//        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
//
//        String s1 = "fred";
//        int[] arr = {11,23,45};

        String s = "(){}[]";
        checkBrackets(s);

//        char a = stack.pop();
//        char b = stack.pop();
//        char c = stack.pop();
//        char d = stack.pop();
//        System.out.println(a+" "+b+" "+c+" "+d);
    }

    public static boolean checkBrackets(String s){
        String preS = "{[(";
        String postS = ")]}";

        String totalS = "{}[]()";
        char[] totalStr = totalS.toCharArray();

        char[] str = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<str.length; i++){
            if (postS.contains(String.valueOf(str[i])) && stack.size() == 0){
                System.out.println("false");
                return false;
            }else if (preS.contains(String.valueOf(str[i]))){
                stack.push(str[i]);
            }else if (stack.lastElement() == totalS.charAt(getIndex(totalStr,str[i])-1)){
                stack.pop();
            }else if (stack.lastElement() != str[i]){
                System.out.println("false");
                return false;
            }
        }

        if (stack.size() == 0){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static int getIndex(char[] chars,char c){
        int index = 999;
        for (int i=0; i<chars.length; i++){
            if (chars[i] == c){
                index = i;
            }
        }
        return index;
    }
}
