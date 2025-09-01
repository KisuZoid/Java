package Java.JAVA_DSA;

public class _006_Loops {
    public static void main(String[] args) {
        // for loop -> for (initialization; condition; update){ //perform code}
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // while loop -> while (condition == true){//perform code}
        System.out.println("\nWhile Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // do-while loop -> do { //perform code } while (condition == true); gives at least one iteration
        System.out.println("\nDo-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k < 5);
    }
}

/*
 * Looping Statements in Java
 *
 * 1. for loop: Used to execute a block of code a specific number of times.
 * 2. while loop: Used to execute a block of code as long as a condition is true.
 * 3. do-while loop: Similar to the while loop, but guarantees at least one execution.
 */
