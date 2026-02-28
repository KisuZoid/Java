package Java.JAVA_DSA;

public class _010_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 30; //a being modified, as a is defined in bigger scope or outside the block, so no need to define again. i.e. a is defined outside the bracket/block.
            System.out.println(a); //30

            int c = 50; //values initialised in block, will remain in block and can't be used outside the block.
            System.out.println(c); //50
        }

        // 'c' is not defined outside the block, scope of c is only within block.

        // System.out.println(c);  -> gives error
        System.out.println(a); //30
        System.out.println(b); //20
    }
}

// scope: the area of the program where a variable is accessible. In Java, there are four types of scope: class scope, method scope, block scope, and loop scope.
/*
    class scope: variables declared within a class but outside of any method, constructor, or block. These variables are called class variables or static variables and can be accessed by all methods in the class.

    method scope: variables declared within a method. These variables are called local variables and can only be accessed within the method where they are declared.

    block scope: variables declared within a block of code, such as an if statement or a loop. These variables can only be accessed within the block where they are declared.

    loop scope: variables declared within a loop. These variables can only be accessed within the loop where they are declared.
*/