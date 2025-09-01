package Java.JAVA_DSA;

public class _003_DataTypes_Variable {
    public static void main(String[] args) {
        //Variable
        int variable1, variable2; //declare variable
        variable1 = 10; // Assign value to variable1
        variable2 = 20; // Assign value to variable2

        int variable3 = 30; // Declare and assign value to variable3
        System.out.println("Variable1: " + variable1 + ", Variable2: " + variable2 + ", Variable3: " + variable3);

        // Primitive Data Types
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        double myDoubleNum = 19.99;  // Double precision floating point number, it is a default data type for decimal values
        long myLongNum = 150000L;   // Long integer
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // Print the values
        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Double: " + myDoubleNum);
        System.out.println("Long: " + myLongNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);

        //wrapper classes --> gives the ability to use primitive types as objects.
        Integer myInteger = myNum;       // Integer (wrapper class)
        Float myFloat = myFloatNum;      // Float (wrapper class)
        Double myDouble = myDoubleNum;   // Double (wrapper class)
        Long myLong = myLongNum;         // Long (wrapper class)
        Character myCharacter = myLetter; // Character (wrapper class)
        Boolean myBoolean = myBool;      // Boolean (wrapper class)
        String myString = myText;        // String (wrapper class)

        // Print the wrapper class values
        System.out.println("Wrapper Integer: " + myInteger);
        System.out.println("Wrapper Float: " + myFloat);
        System.out.println("Wrapper Double: " + myDouble);
        System.out.println("Wrapper Long: " + myLong);
        System.out.println("Wrapper Character: " + myCharacter);
        System.out.println("Wrapper Boolean: " + myBoolean);
        System.out.println("Wrapper String: " + myString);
    }
}
