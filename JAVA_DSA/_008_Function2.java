package Java.JAVA_DSA;
import java.util.Scanner;

public class _008_Function2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Greeting(in); //one way to use input in function, i.e. calling input function inside main function

        Calculator(); //another way to use input in function, i.e. calling input function inside another function
        in.close();
    }

    static void Greeting(Scanner in){
        System.out.print("What is your name: ");
        String name = in.nextLine();

        System.out.println("Hello " + name);
    }

    static void Calculator(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Numbers: ");
        int first_num = in.nextInt();

        System.out.print("Enter 2st Numbers: ");
        int second_num = in.nextInt();

        System.out.println("Sum: " + add(first_num, second_num));
        System.out.println("Subtraction: " + subtract(first_num, second_num));
        System.out.println("Multiplication: " + multiply(first_num, second_num));
        System.out.println("Division: " + divide(first_num, second_num));
        System.out.println("Modulo: " + modulo(first_num, second_num));
        in.close();
    }

    //parameterized function: function with parameters and return type.
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        if (b!=0){
            return a/b;
        }
        else{
            System.out.println("Unvalid b");
            return 0;
        }
    }
    static int modulo(int a, int b){
        return a%b;
    }
}
