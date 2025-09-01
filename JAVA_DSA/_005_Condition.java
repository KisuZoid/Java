package Java.JAVA_DSA;

public class _005_Condition {
    public static void main(String[] args) {
        int age = 18;

        // if-else statement -> if (condition == true) { //perform code } else { //perform code }
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age == 18) {
            System.out.println("You are exactly 18 years old.");
        } else {
            System.out.println("You are an adult.");
        }

        // switch statement -> switch (variable) { case value1: //perform code; break; case value2: //perform code; break; default: //perform code; break; }
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
