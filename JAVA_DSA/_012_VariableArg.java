package Java.JAVA_DSA;

import java.util.Arrays;

public class _012_VariableArg {
    public static void main(String[] args) {
        func(); //empty string
        fun(1, 2, 3, 4, 5, 6, 7, 7, 8, 9); // calls method fun with int args
        fun("Kislay", "Anand"); //calls method with String args

        multiple(3, 4, "Kislay", "Anand", " "); //multiple arguments

    }

    // Variable Arguments (Varargs) -> Allows a method to accept a variable number of arguments of the same type, useful when the number of arguments is not known in advance.

    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // Method overloading
    static void fun(int ...v){
        System.out.println("Integer fun");
        System.out.println(Arrays.toString(v)); 
    }

    static void fun(String ...s){
        System.out.println("String fun");
        System.out.println(Arrays.toString(s)); 
    }

    //v is a name we have used, and is treated like an array within the method.
    // as it is mentioned int ...v i.e. v takes array of integers.
    // we can use any name instead of v, like int ...numbers or int ...values, it is just a convention to use v for variable arguments.

    static void multiple(int a, int b, String ...v){ //variable length args always in the end

    }
}
