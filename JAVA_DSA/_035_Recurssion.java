package Java.JAVA_DSA;

public class _035_Recurssion {
    public static void main(String[] args) {
        print(1);
        System.out.println(fibo(6));

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(search(arr, 4, 0, arr.length-1));
    }

    static void print(int n){
        if (n == 5){ //base condition
            System.out.println("Hello World");
            return;
        }
        System.out.println("Hello World");

        //this is the tail recurssion
        //this is the last function call
        print(n+1);
    }

    static int fibo(int n){
        if (n < 2){ //base condition
            return n;
        }
        return fibo(n-1) + fibo(n-2); // fibo(n) = fibo(n-1) + fibo(n-2) -> recurrence relation
    }

    // s, e -> will pass in future function calls => arguments, m-> will pass in current function call, and not pushing it to future func call => body of function
    //whenever calling a recurssion call, make sure to return the result of function call of the return type
    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if (arr[m] == target){
            return m;
        }else if (target < arr[m]){
            return search(arr, target, s, m - 1);
        }else{
            return search(arr, target, m+1, e);
        }
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

How to understand and approach a problem:
    1. Identify if prblem can be broken down into smaller one or not
    2. write a recurrence relation if needed
    3. Draw the recurrsive tree
    4. About the tree:
        - See the flow of functio, how they are getting in stack
        - Identify & focus on left tree calls and right tree calls
        - Draw the tree and poiters again and again using pen and paper and use debugger to see the flow
    5. See how the values and what type of values are returning at each step, see where the function call come out. In the end, you will come out of the main function.

Variables: (VVV. Important)
    -> Arguments -> will going to go into the next function call
    -> Return Type
    -> Body of function -> variables that are specific to that call will go into body function 

Binary Search with recurssion:
    -> Compare -> O(1)
    -> Dividing into 2 halves 

    F(N) => O(1) + F(N/2) -> recurrence relation

Types of recurrence relation:
    1. Linear Recurrene relation -> ex: fibo
    2. Divide and Conquere recurrence relation -> ex: BS => search space will be divided
*/
