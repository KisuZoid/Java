package Java.JAVA_DSA;
import java.util.Scanner;

public class _013Q1_PrimeNum {
    public static void main(String[] args) {
        //take user input, till that number find total prime numbers and say that number is prime or not.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPrime(n));
        primeBetween(n);

        in.close();
    }

    //check prime or not
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }

        // - or - while loop

        /*
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }        
        */
       
        return true;
    }

    //print prime between 
    static void primeBetween(int n){
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

}
