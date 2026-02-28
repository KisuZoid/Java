package Java.JAVA_DSA;

import java.util.Scanner;

public class _013Q2_Armstrong {

    public static void main(String[] args) { 
        // Armstrong number: n digit number, sum of power of n on each digit is same as number.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to check Armstrong: ");
        Integer input1 = in.nextInt();
        isArmstrong(input1);

        System.out.print("First n Armstrong: ");
        int input2 = in.nextInt();
        Armstrong(input2);
        in.close();

    }

    //first n Armstrong number
    static void Armstrong(int n){
        int count = 0;
        Integer val = 0;
        while (count < n){
            int sum = 0;
            int duplicate = val;
            int length = val.toString().length();

            while (duplicate > 0){
                int last_digit = duplicate%10;
                last_digit = (int) Math.pow(last_digit, length);
    
                sum += last_digit;
                duplicate = duplicate/10;
            }

            if (sum == val){
                System.out.println(sum);
                count++;
            }
            val++;
        }
    }

    static void isArmstrong(Integer num){
        String n = num.toString();
        int length = n.length();
        
        /*
            traditional approach:
            int sum = 0;
            int base = 48;
            
            for (int i = 0; i < length; i++){
                char d = n.charAt(i);
                int charDigit = d;
    
                int digit = (charDigit - base); 
    
                sum += Math.pow(digit, length);            
            }
        */

        int sum = 0;
        int dublicate = num;
        while (dublicate > 0){
            int last_digit = dublicate % 10;
            last_digit = (int) Math.pow(last_digit, length);

            sum += last_digit;
            dublicate /= 10;
        }

        if (sum == num){
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}
