package Java.JAVA_DSA;

public class _005_Condition {
    public static void main(String[] args) {
        int age = 18;

    /*
    if-else statement
        if (condition == true) {
            // perform code
        } else {
            // perform code
        }
    */
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age == 18) {
            System.out.println("You are exactly 18 years old.");
        } else {
            System.out.println("You are an adult.");
        }

    /*
    switch statement
        switch (variable) {
            case value1:
                // perform code
                break;

            case value2:
                // perform code
                break;

            default:
                // perform code
        }
    */
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);
    }
}

/*
 * Conditional Statements in Java
 *
 * 1. if-else statement: Used to execute a block of code among two or more alternatives.
 * 2. switch statement: Used to execute one block of code among many alternatives.
 * 
 * break statement: Used to exit a loop or switch statement.
 */

/*
    ==============================
    LOGICAL OPERATORS
    ==============================

    &&  (Logical AND)
    true && true   -> true
    true && false  -> false

    Example:
    int a = 10, b = 20;
    if (a > 5 && b > 15) {
        System.out.println("Both conditions are true");
    }

    ||  (Logical OR)
    true || false  -> true
    false || false -> false

    Example:
    if (a > 15 || b > 15) {
        System.out.println("At least one condition is true");
    }

    !   (Logical NOT)
    !true  -> false
    !false -> true

    Example:
    boolean isJavaFun = true;
    if (!isJavaFun) {
        System.out.println("Java is not fun");
    }


    ==============================
    BITWISE OPERATORS
    ==============================

    &   (Bitwise AND)
    5 & 3 -> 1
    0101
  & 0011
    ----
    0001

    Example:
    int x = 5, y = 3;
    System.out.println(x & y);

    |   (Bitwise OR)
    5 | 3 -> 7

    Example:
    System.out.println(x | y);

    ^   (Bitwise XOR)
    5 ^ 3 -> 6

    Example:
    System.out.println(x ^ y);

    ~   (Bitwise NOT)
    ~5 -> -6

    Example:
    System.out.println(~x);


    ==============================
    COMPARISON (RELATIONAL) OPERATORS
    ==============================

    ==  (Equal to)
    a == b

    !=  (Not equal to)
    a != b

    >   (Greater than)
    a > b

    <   (Less than)
    a < b

    >=  (Greater than or equal to)
    a >= b

    <=  (Less than or equal to)
    a <= b

    Example:
    if (a != b) {
        System.out.println("a is not equal to b");
    }
*/