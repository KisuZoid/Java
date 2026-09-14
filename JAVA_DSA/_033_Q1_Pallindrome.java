package Java.JAVA_DSA;

import java.util.Scanner;

public class _033_Q1_Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(isPallindrome(word));

        in.close();
        
    }
    static boolean isPallindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}

//or


// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     String word = in.next().toLowerCase();
//     char[] ch = word.toCharArray();
    
//     for (int i = 0; i < ch.length/2 + 1; i++){
//         if (i < ch.length -1 -i){
//             if (ch[i] == ch[ch.length -1 - i]){continue;} 
//             else {
//                 System.out.println("Not Pallindrome");
//                 break;
//             }
//         }
//         System.out.println("Is Pallindrome");
//     }

//     in.close();
// }