package leetcode;

public class StrStr {

    public static void main(String[] args){
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(getFirstIndex(haystack,needle));
    }

    public static int getFirstIndex(String haystack, String needle){
        char[] haystackChar = haystack.toCharArray();
        char[] needleChar = needle.toCharArray();
        int checkNumber = 0;
        int result = 999;

        if (needleChar.length == 0){
            result = 0;
        }else if (!haystack.contains(needle)){
            result = -1;
        }else if (haystack.contains(needle)){
            for (int i=0; i<haystackChar.length; i++){
                checkNumber = 0;
                for (int j=0; j<needleChar.length; j++){
                    if (haystackChar[i+j] != needleChar[j]){
                        break;
                    }else {
                        checkNumber = checkNumber + 1;
                    }
                }
                if (checkNumber == needleChar.length){
                    result = i;
                    break;
                }

            }
        }

        return result;


    }
}
