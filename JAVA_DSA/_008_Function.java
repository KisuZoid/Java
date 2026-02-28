package Java.JAVA_DSA;

public class _008_Function {

    /*
        main() is the starting point of the program.
        It is static because Java runs it without creating an instance of the class.
    */
    public static void main(String[] args) {

        // Calling static method (NO instance needed)
        sum();

        // Creating an instance (object) of the class
        _008_Function obj = new _008_Function();

        // Calling non-static method (instance REQUIRED)
        obj.subtract();
    }

    /*
        Static Method:
        - Belongs to the class
        - Can be called without creating an instance
    */
    static void sum() {
        int a = 10;
        int b = 5;
        System.out.println("Sum: " + (a + b));
    }

    /*
        Non-Static Method:
        - Belongs to an instance (object)
        - Requires an instance to be called
    */
    void subtract() {
        int a = 10;
        int b = 5;
        System.out.println("Subtraction: " + (a - b));
    }

    /* --------------------------------------------------
        FUNCTION SYNTAX:

        access_modifier returnType functionName() {
            // body
            return statement;
        }
    -------------------------------------------------- */

    /*
        ACCESS MODIFIERS:
        - public    → accessible from anywhere
        - private   → accessible only within the same class
        - protected → accessible within the package and subclasses
        - default   → accessible within the same package

        RETURN TYPE:
        - void      → returns nothing
        - int, String, etc → returns a value

        FUNCTION NAME:
        - Should be meaningful
        - Follow camelCase naming convention
    */

    /*
        INSTANCE (OBJECT):
        - An instance is a real object created from a class
        - Created using the 'new' keyword
        Example:
            _008_Function obj = new _008_Function();

        - Each instance has its own copy of non-static members
    */

    /*
        STATIC KEYWORD:
        - Static members belong to the class
        - They can be accessed without creating an instance
        Example:
            static int x = 10;

        WHY STATIC METHODS CANNOT ACCESS NON-STATIC MEMBERS:
        - Static methods run without any object
        - Non-static members exist only inside an object
        - Java does not know which object's data to use

        WHY NON-STATIC METHODS CAN ACCESS STATIC MEMBERS:
        - Static members belong to the class
        - The class exists before any object is created
    */

    /*
        DIFFERENCE BETWEEN STATIC AND NON-STATIC METHODS:

        Static Method:
        - Called using class name
        - Instance not required
        - Can access only static members directly

        Non-Static Method:
        - Called using object reference
        - Instance required
        - Can access both static and non-static members
    */
}