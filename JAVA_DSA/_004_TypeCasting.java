package Java.JAVA_DSA;

public class _004_TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Casting (Widening): " + myDouble); //output: 9.0

        // Explicit Casting (Narrowing)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Manual casting: double to int
        System.out.println("Explicit Casting (Narrowing): " + anotherInt); //output: 9

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = 9.99;

        //individual results:
        System.out.println((f*b) + " " + (i/c) + " " + (d - s));
        // float + int + double = double --> as double is the largest data type

        double result = ((f*b) + (i/c) - (d - s)); // Implicit casting, although all variables are of different types, the result is a double
        System.out.println("Result: " + result);
    }
}
/*
 * Type Casting: 
 *      Type casting is the process of converting a variable from one data type to another.
 *      There are two types of type casting in Java:
 *          1. Implicit Casting (Widening): Automatically converting a smaller data type to a larger data type. ex: int to double, float to double, byte to int, short to int
 *          2. Explicit Casting (Narrowing): Manually converting a larger data type to a smaller data type. ex: double to int, double to float, int to byte, int to short
 *
 * Smaller data type: A data type that has a smaller range or size compared to another data type. 
 *
 * Larger data type: A data type that has a larger range or size compared to another data type. 
 */