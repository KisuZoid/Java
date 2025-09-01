package Java.backendMastery; // package name

public class _001_Basic{ // public is the access modifier it means this class can be accessed from any where in the project. class is the keyword to define a class in java. _001_Basic is the name of the class and it should me same as the file name.
    public static void main(String[] args) { 
    // main is the entry point of the java program. it is the method where the program starts execution. String[] args is the parameter of the main method. it is used to pass command line arguments(the arguments that are passed to the program from the command prompt) to the program.
    // public is the access modifier it means this method can be accessed from any where in the project. static is the keyword it means this method can be accessed without creating an object of the class. void is the return type of the method it means this method does not return any value.
        
        System.out.println("Hello world"); // System.out.println is the statement to print the message in the console. "ln" is for new line. it means the message will be printed in a new line.
        System.out.print("Hello World 2"); // no new line will create.
    }
}


/*
 * Java -> classes and objects
 *  Classes are blueprints for objects
 *  Objects are instances of classes
 *      Ex:
 *          class Car{
 *                      int tyres;
 *                      int seats;
 *                      drive(){How to drive}
 *                      }
 *  Here Car is a class and Car object is an instance of Car class.
 *  Car myCar = new Car(); // myCar is an object of Car class. 
 *                         // new keyword is used to create a new object.
 *  myCar.drive(); // method
 *  myCar.tyres = 4; // attribute
 * 
 */