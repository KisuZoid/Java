package Java.JAVA_DSA.Problem.Arrays;

import java.util.Arrays;

public class _002_Anagram{
    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace"));
    }

    public static boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
    //or
    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            int i = 0;
            while (i < s.length()){
                int counter_s = 0;
                int counter_t = 0;
                char value = s.charAt(i);
                for (int traverse = 0; traverse < s.length(); traverse++){
                    if (value == s.charAt(traverse)){
                        counter_s++;
                    }
                }
                for (int traverse = 0; traverse < s.length(); traverse++){
                    if (value == t.charAt(traverse)){
                        counter_t++;
                    }
                }

                if(counter_s != counter_t){
                    return false;
                }
                i++;
                
            }
            return true;
        }else{
            return false;
        }
    }
}