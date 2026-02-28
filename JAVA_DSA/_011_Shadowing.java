package Java.JAVA_DSA;

public class _011_Shadowing {

    static int x = 10; //instance variable -> shadowed by local variable
    static int y = 50;
    public static void main(String[] args) {

        System.out.println(x); //10

        int x = 20; //local variable -> shadows instance variable
        System.out.println(x); //20
        
        method(); //10

        int y; //declare y, but as value of y is not initialized then it gives error.
        // System.out.println(y); //error: variable y might not have been initialized -> y=50 is shadowed by local variable y, but local variable y is not initialized.

        y = 100;
        System.out.println(y); //100


    }

    static void method(){
        System.out.println(x); //10
    }
}

// Shadowing is a concept in programming where a variable declared within a certain scope (like a method or block) has the same name as a variable declared in an outer scope (like a class). The inner variable "shadows" the outer variable, meaning that within the inner scope, references to that variable name will refer to the inner variable rather than the outer one. This can lead to confusion if not used carefully, as it may not be immediately clear which variable is being referenced.
