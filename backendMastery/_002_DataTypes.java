package Coding.backendMastery;

public class _002_DataTypes {
    public static void main(String[] args) {
        int a = 1; // declaration of variable "a" with data type int and value 1
        System.out.println(Integer.toString(a)); // Output: 1, "Integer" provides additional methods. here we are using toString() method to convert int to string.

        String name = "Kislay"; 
        System.out.println(name); // output: Kislay
    }
}

// Primitive Data Types:
/*
 * byte   : 8-bit  (-128 to 127)
 * short  : 16-bit (-32,768 to 32,767)
 * int    : 32-bit (-2^31 to 2^31 - 1)
 * long   : 64-bit (-2^63 to 2^63 - 1)
 * float  : 32-bit (approx 1.4E-45 to 3.4E38, ~7 decimal digits precision)
 * double : 64-bit (approx 4.9E-324 to 1.8E308, ~15 decimal digits precision)
 * char   : 16-bit (Unicode character, 0 to 65535)
 * boolean: true/false
 */

// Wrapper Classes (Object versions of primitives):
/*
 * Byte, Short, Integer, Long, Float, Double, Character, Boolean
 * String is not a primitive, but a commonly used class for text.
 */
