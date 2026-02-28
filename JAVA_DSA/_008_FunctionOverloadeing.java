package Java.JAVA_DSA;

public class _008_FunctionOverloadeing {
    public static void main(String[] args) {
        // Overloaded functions with different parameters -> happens at compile time. i.e. the compiler determines which function to call based on the arguments passed during the function call.
        fun(10);
        fun("Hello");
        fun(20, "World");
    }

    static void fun(int a){
        System.out.println("First Function: " + a);
    }

    static void fun(String s){
        System.out.println("Second Function: " + s);
    }

    static void fun(int a, String s){
        System.out.println("Third Function: " + a + " " + s);
    }
}

// Function Overloading -> The ability to create multiple methods with the same name but different parameters (number, type, or order of parameters) within the same class. It allows for better code readability and flexibility in method usage.
