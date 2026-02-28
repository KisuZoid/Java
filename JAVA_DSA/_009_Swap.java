package Java.JAVA_DSA;

//use function to swap two numbers
public class _009_Swap {

    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("Before swapping: a = 5, b = 6");
        System.err.print("After swapping using third variable: ");
        swap1(a, b);
        System.out.println("Inside main: a = " + a + ", b = " + b + "\n"); // \n is used to print in new line

        int c = 5, d = 6;
        System.out.println("Before swapping: c = 5, d = 6");
        System.err.print("After swapping without using third variable: ");
        swap2(c, d);
        System.out.println("Inside main: c = " + c + ", d = " + d);

        /*
            above code will not swap the values of a and b because in Java, when we pass primitive data types (like int) to a method, we are passing a copy of the value. So, the changes made to a and b inside the swap1 and swap2 methods do not affect the original variables in the main method. 
        */

        // To swap using an array
        int[] arr = {5, 6};
        System.out.println("\nBefore swapping using array: arr[0] = 5, arr[1] = 6");
        swapArray(arr);
        System.out.println("After swapping using array: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);

        // To swap using a wrapper class
        Integer x = 5, y = 6;
        System.out.println("\nBefore swapping using wrapper class: x = 5, y = 6");
        swapWrapper(x, y);
        System.out.println("After swapping using wrapper class: x = " + x + ", y = " + y);
    }
    
    //using array
    static void swapArray(int[] arr){
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    //using wrapper class
    static void swapWrapper(Integer x, Integer y){
        Integer temp;
        temp = x;
        x = y;
        y = temp;
    }

    //using third variable
    static void swap1(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap1: a = " + a + ", b = " + b);
    }

    //without using third variable
    static void swap2(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Inside swap2: a = " + a + ", b = " + b);
    }
}

/*
    primitive data types in Java include byte, short, int, long, float, double, char, and boolean. When we pass these types of variables to a method, we are passing a copy of the value. Therefore, any changes made to the parameters inside the method do not affect the original variables outside the method.

    In contrast, when we pass an array or an object (like a wrapper class) to a method, we are passing a reference to the object. This means that changes made to the object inside the method will affect the original object outside the method, because both the original variable and the parameter in the method refer to the same object in memory.

    jave has no pass by reference, it only has pass by value. So, when we pass a and b to the swap1 and swap2 methods, we are passing a copy of the values of a and b. Therefore, any changes made to a and b inside the swap1 and swap2 methods do not affect the original variables in the main method.
          
    To actually swap the values, we would need to use an array or a wrapper class to hold the values and pass that to the method.
*/