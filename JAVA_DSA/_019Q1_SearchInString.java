package Java.JAVA_DSA;
import java.util.Arrays;

public class _019Q1_SearchInString {
    public static void main(String[] args){
        String val = "Kislay";
        char target = 'K';

        //char array converstion
        String ch = (Arrays.toString(val.toCharArray()));
        System.out.println(ch);

        boolean answer1 = search(val, target);
        System.out.println(answer1);

        boolean answer2 = search_enhance(val, target);
        System.out.println(answer2);
    }

    static boolean search(String value, char target){
        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean search_enhance(String value, char target){
        for (char element : value.toCharArray()){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}


/*
Arrays.toString(val.toCharArray())

Functionality:
1. val.toCharArray()
   -> Converts the String into a character array (char[]).

   Example:
   "Hello" → ['H', 'e', 'l', 'l', 'o']

2. Arrays.toString(...)
   -> Converts the array into a readable String format for printing.

   Example output:
   [H, e, l, l, o]

Type checking:
val                     -> String
val.toCharArray()       -> char[]
Arrays.toString(...)    -> String

Check types:
System.out.println(val.getClass().getSimpleName());                 // String
System.out.println(val.toCharArray().getClass().getSimpleName());   // char[]
System.out.println(
    Arrays.toString(val.toCharArray()).getClass().getSimpleName()
);                                                                  // String
*/