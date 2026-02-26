package Java.JAVA_DSA;
// Q. Check if the given string is in upper case or not.

import java.util.Scanner;
public class _007Q4_CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); //trim() -> remove left and right extra spaces, then charAt(index) i.e. 0th index is the first character

        if (ch >= 'a' && ch <= 'z'){ //chat is the ASCII value of this a character, and we are checking it from a to z value. 
            System.out.println("LowerCase");
        }
        else{
            System.out.println("upperCase");
        }
        in.close();
    }
}
