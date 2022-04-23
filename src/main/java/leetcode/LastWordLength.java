package leetcode;

public class LastWordLength {

    public static void main(String[] args){
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        char[] stringChar = s.toCharArray();

        int count = 0;
        for (int i=stringChar.length-1; i>=0; i--){
            if (stringChar[i] == ' '){
                count = count + 1;
            }else {
                break;
            }
        }

        char[] newStringChar = new char[stringChar.length-count];
        for (int i=0; i<newStringChar.length; i++){
            newStringChar[i] = stringChar[i];
        }

        int newCount = 0;
        for (int i=newStringChar.length-1; i>=0; i--){
            if (newStringChar[i] != ' '){
                newCount = newCount + 1;
            }else {
                break;
            }
        }
        return newCount;
    }
}
