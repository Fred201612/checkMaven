package leetcode;

public class RomeNumber {

    public static void main(String[] args){
        String s = "MCMXCIV";
        ChangeToNumber(s);
    }

    private static void ChangeToNumber(String s){
        int total = 0;
        char list[] = s.toCharArray();
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]);
            switch (list[i]){
                case 'I':
                    total = total + GetPriority('I');
                    break;
                case 'V':
                    total = total + GetPriority('V');
                    break;
                case 'X':
                    total = total + GetPriority('X');
                    break;
                case 'L':
                    total = total + GetPriority('L');
                    break;
                case 'C':
                    total = total + GetPriority('C');
                    break;
                case 'D':
                    total = total + GetPriority('D');
                    break;
                case 'M':
                    total = total + GetPriority('M');
                    break;
            }
        }

        for (int i=0; i<list.length-1; i++){
            if (GetPriority(list[i]) < GetPriority(list[i+1])){
                total = total - 2 * GetPriority(list[i]);
            }
        }

        System.out.println(total);
    }

    private static int GetPriority(Character s){
        switch (s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }

        return 0;
    }
}
