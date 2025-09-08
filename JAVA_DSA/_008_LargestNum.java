package Java.JAVA_DSA;

import java.util.Scanner;

public class _008_LargestNum {
    public static void Largest_2(int a, int b, int c){
        int max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        
        System.out.println(max + " is the largest number");
    }

    //or

    public static int Largest_3(int a, int b, int c){
        int max = 0;

        if (a > b){
            max = a;
        }
        else{
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max; // as return type is int in function declaration
    }

    //or

    //using built-in function
    public static int Largest_4(int a, int b, int c){
        int max = Math.max(a, Math.max(b, c)); //Math.max() is a built-in function to find the maximum of two numbers
        return max;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the Second number: ");
        int b = input.nextInt();

        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        Largest_2(a, b, c);
        System.out.println(Largest_3(a, b, c) + " is the largest number");
        System.out.println(Largest_4(a, b, c) + " is the largest number");
        input.close();
    }
}
