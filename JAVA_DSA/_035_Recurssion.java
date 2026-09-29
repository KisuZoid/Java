package Java.JAVA_DSA;

public class _035_Recurssion {
    public static void main(String[] args) {
        print(1);
        System.out.println(fibo(6));
    }

    static void print(int n){
        if (n == 5){ //base condition
            System.out.println("Hello World");
            return;
        }
        System.out.println("Hello World");
        print(n+1);
    }

    static int fibo(int n){
        if (n < 2){ //base condition
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

/*
Note:
    1. While the function is not finished executing, it will remain in stack.
    2. When a function finishes executing, it is removed from the stack, and the flow of program is restored where the function was called.

Base Condition:
    It is the condition where our recurssion stops making new call.

if no base condition -> function will keep on calling => stack will be filled again and again (each times, takes some memory) -> memory will exceed the limit => stack overflow error

Recurssion:
    Function calling itself.

Why Recurssion:
    It helps us solving bigger complex problem in a simple way.
    We can convert recurssion solution into iteration and vice-versa.
    Space complexity is not constant because of recurssive calls
    Helps us in breaking down bigger problem into smaller ones

Visualize recurssion: 
    program start:
    |
    main()
    |
    print(1)
    |
    print(2)
    |
    print(3)
    |
    print(4)
    |   
    print(5) -> print(4) -> print(3) -> print(2) -> print(1) -> main() -> program finished


    -> Break bigger problem into smaller one
    -> The base condition is represented by the answers we already have
        in case of fibonacci number, f(0) = 0, f(1) = 1
*/
