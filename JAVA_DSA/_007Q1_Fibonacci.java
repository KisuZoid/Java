package Java.JAVA_DSA;

import java.util.Scanner;

//Fibonacci series
public class _007Q1_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fib;

        //normal
        fib = fibonacci_normal(n); 

        //recurssion
        fib = fibonacci_recurssive(n);
        System.err.println(fib);
        in.close();
    }

    //nth fibonacci using normal method
    public static int fibonacci_normal(int n){
        int a = 0;
        int b = 1;
        
        while (n>=2){
            int temp = b;
            b = a+b; 
            a = temp;
            n--;
        }
        System.out.println(b);
        return 0;
    }

    public static int fibonacci_recurssive(int n){
        //nth fibonacci using recurssion
        if (n == 1){
            return 1;
        } else if (n==0){
            return 0;
        }
        else{
            return (fibonacci_recurssive(n-1) + fibonacci_recurssive(n-2));
        }
    }
}
