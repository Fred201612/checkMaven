package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SameFormatString {

    public static void main(String[] args){

        String s = "paper";
        String t = "title";

        System.out.println(solve(s,t));
    }

    public static boolean solve(String s, String t){

        HashMap<Character,Character> stringMap = new HashMap<Character, Character>();

        for (int i=0; i<s.length(); i++){
            if (stringMap.containsKey(s.charAt(i))){
                if (!(stringMap.get(s.charAt(i)) == t.charAt(i))){
                    return false;
                }
            }else {
                stringMap.put(s.charAt(i),t.charAt(i));
            }


        }

        HashMap<Character,Character> stringMap1 = new HashMap<Character, Character>();

        for (int i=0; i<t.length(); i++){
            if (stringMap1.containsKey(t.charAt(i))){
                if (!(stringMap1.get(t.charAt(i)) == s.charAt(i))){
                    return false;
                }
            }else {
                stringMap1.put(t.charAt(i),s.charAt(i));
            }


        }


        return true;
    }
}
