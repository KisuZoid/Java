package Java.JAVA_DSA;
import java.util.Scanner; // scanner class is present in java.util package, used to take primitive types input from the user.

public class _002_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter your name: "); // Prompt the user for input
        String name = input.nextLine(); // Read a line of text from the user
        System.out.println("Hello, " + name + "!"); // Greet the user
        input.close(); // Close the scanner
    }
}

/*
 * System.out: 
 *      it is a standard output stream in Java, used to print output to the console.
 * 
 * Scanner: 
 *      it is a class in Java that is used to take input from the user.
 * 
 * nextLine(): 
 *      it is a method of the Scanner class that reads a line of text from the user, i.e. it captures the entire line of input until the user presses Enter.
 * 
 * System.in: 
 *      it is an input stream in Java, used to read input from the user.
 * 
 * new: 
 *      it is a keyword in Java that is used to create new objects.
 * 
 * close(): 
 *      it is a method of the Scanner class that closes the scanner object and releases any associated resources.
 * 
 * nextInt(): 
 *      it is a method of the Scanner class that reads an integer value from the user.
 * 
 * next(): 
 *      it is a method of the Scanner class that reads the next token (word) from the user.
 */
