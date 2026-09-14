package Java.JAVA_DSA;

import java.util.ArrayList;

public class _030_PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.2f %n", a); //--> also rounding off till 2 decimal values.
        // % -> is placeholder
            /*
                %s (String): Outputs a string. If the argument is not a string, it automatically calls toString().
                %d (Decimal Integer): Formats standard integers (e.g., int, long, short, byte).
                %f (Floating-point): Formats decimal numbers (e.g., float, double).
                %b (Boolean): Outputs "true" or "false" based on boolean expressions.
                %c (Character): Formats a single Unicode character.
                %h (Hash Code): Outputs the hex representation of the object's hash code.
                %n (Line Separator): Inserts a platform-specific newline character (preferable over \n)
            */
        // .2 --> till how many decimal value we want 

        System.out.printf("Pie: %.3f %n", Math.PI);

        System.out.printf("Hello, I am %s and I am %s %n%n", "Kislay", "Cool");

        //Operator:
        System.out.println('a' + 'b'); //195 --> sum of ASCII value of a and b
        System.out.println("a" + "b"); //ab --> string will not be converted into ASCII value
        System.out.println((char) ('a' + 3)); //d

        System.out.println("a" + 1); //a1
        // integer will will be converted to Integer (wrapper class) that will call toString() => same as after a few steps: "a" + "1"

        // String + notString ==> convert notString into string -> call toString() method
        System.out.println("Kislay" + new ArrayList<>());
        System.out.println("Kislay" + new Integer(56));

        // System.out.println(new Integer(56) + new ArrayList<>()); --> Error
        System.out.println(new Integer(56) + "" + new ArrayList<>());
        // + operator can only be used with primitive data type or will all the complex objects but atleast one of these object is type string.

        // if one of datatype is string => result will be of type string
        System.out.println("a" + 'a'); //aa

    }
}

/*
    PrintStream java.io.PrintStream.printf(String format, Object... args)
    A convenience method to write a formatted string to this output stream using the specified format string and arguments.

    An invocation of this method of the form out.printf(format, args) behaves in exactly the same way as the invocation

    out.format(format, args)
*/