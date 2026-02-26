package Java.JAVA_DSA;

//find the largest among three numbers
import java.util.Scanner;

public class _007Q2_LargestNum {

    //Creating the custom function
    public static void Largest_1(int a, int b, int c){
        if (a >= b && a >= c){
            System.out.println(a + " is the Largest Number");
        }
        else if (b >= a && b >= c){
            System.out.println(b + " is the Largest Numbert");
        }
        else{
            System.out.println(c + " is the Largest Number");
        }
    }

    //main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the Second number: ");
        int b = input.nextInt();

        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        Largest_1(a, b, c);
        input.close();
    }
}

