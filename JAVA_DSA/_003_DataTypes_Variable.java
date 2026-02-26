package Java.JAVA_DSA;

public class _003_DataTypes_Variable {
    public static void main(String[] args) {

        //Variable
        int variable1, variable2; //declare variable
        variable1 = 10; // Assign value to variable1
        variable2 = 20; // Assign value to variable2

        int variable3 = 30; // Declare and assign value to variable3
        System.out.println("Variable1: " + variable1 + ", Variable2: " + variable2 + ", Variable3: " + variable3);

        // ==============================
        // Primitive Data Types
        // ==============================
        byte myByteNum = 100;        // Byte
        short myShortNum = 1000;     // Short
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        double myDoubleNum = 19.99;  // Double precision floating point number
        long myLongNum = 150000L;    // Long integer
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean

        // ==============================
        // Non-Primitive Data Types
        // ==============================
        String myText = "Hello";           // String
        int[] myArray = {1, 2, 3, 4};      // Array
        Student myStudent = new Student(); // Class Object
        Day today = Day.MONDAY;            // Enum

        // ==============================
        // Type Casting
        // ==============================
        // Implicit Casting (Widening)
        double castDouble = myNum;          // int -> double (automatic)

        // Explicit Casting (Narrowing)
        int castInt = (int) myDoubleNum;    // double -> int (manual)

        // ==============================
        // Stack and Heap Memory Notes
        // ==============================

        // STACK MEMORY:
        // - Stores primitive variables
        // - Stores references (addresses) of non-primitive objects
        // - Memory allocation and deallocation is fast
        // - Works in LIFO (Last In First Out) manner
        // - Each thread has its own stack

        int a = 10;        // 'a' is stored directly in stack
        int b = 20;        // 'b' is stored directly in stack

        // HEAP MEMORY:
        // - Stores actual objects (non-primitive data)
        // - Memory is shared across threads
        // - Allocation and deallocation is slower than stack
        // - Garbage Collector removes unused objects

        String s1 = "Java";        // reference s1 in stack, "Java" object in heap
        int[] arr = {1, 2, 3};     // reference arr in stack, array object in heap
        Student s2 = new Student();// reference s2 in stack, object in heap

        // Stack vs Heap Example:
        // s1 -----> "Java"   (heap)
        // arr ----> {1,2,3}  (heap)
        // s2 -----> Student object (heap)

        // ==============================
        // Wrapper Classes
        // ==============================
        // gives the ability to use primitive types as objects.
        Byte myByte = myByteNum;
        Short myShort = myShortNum;
        Integer myInteger = myNum;
        Float myFloat = myFloatNum;
        Double myDouble = myDoubleNum;
        Long myLong = myLongNum;
        Character myCharacter = myLetter;
        Boolean myBoolean = myBool;
        String myString = myText;
    }
}

// ==============================
// Supporting Non-Primitive Types
// ==============================
class Student {
    // empty class for example
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}