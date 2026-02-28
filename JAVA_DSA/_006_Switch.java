package Java.JAVA_DSA;
import java.util.Scanner;

public class _006_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        // mango or Mango => Small fruit, water melon or Water Melon =>  large fruit

        //using if-else
        if (fruit.equals("apple") || fruit.equals("Apple")) {
            System.out.println("small fruit");
        }

        //using switch
        switch (fruit) {
            case "mango", "Mango":
                System.out.println("small fruit");
                break;
            
            case "water melon":
                System.out.println("Large fruit");
                break;
            
            default:
                System.out.println("wrong fruit entered");
                break;
        }

        //new switch statement/syntax:
        switch (fruit){
            case "mango" -> System.out.println("small fruit");
            case "water melon" -> System.out.println("Large fruit");
            default -> System.out.println("wrong fruit entered");
        }

        //week and weekend
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        
            default:
                break;
        }

        // new switch statement/syntax:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> {
            }
        }

        //nested switch statement:
        int empId = in.nextInt();
        switch (empId) {
            case 1:
                System.out.println("Kislay");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("emp id: 3");

                String dummy = in.nextLine(); // to consume the newline character after nextInt() i.e. nextInt will take the input but it will not consume the "enter" key i.e. the newline character. so we need to consume it before taking the next input, as nextLine() will take the input until it hits the newline character. if we don't consume it, then nextLine() will take the newline character as input and it will not wait for the user to enter the department id.

                String departmentId = in.nextLine();
                switch (departmentId) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("Wrong department id entered");
                        break;
                }
                break;
            default:
                System.out.println("Wrong employee id entered");
                break;
        }

        // new switch statement/syntax:
        switch (empId) {
            case 1 -> System.out.println("Kislay");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("emp id: 3");

                String dummy = in.nextLine(); 

                String departmentId = in.nextLine(); //
                switch (departmentId) {
                    case "IT" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("Wrong department id entered");
                }
            }
            default -> System.out.println("Wrong employee id entered");
        }
    }
}

// break statement is used to exit the switch block after a case is executed. If break is not used, the program will continue to execute the next cases until it encounters a break or reaches the end of the switch block.

//switch statement is used to execute one block of code among many options based on the value of a variable.

/*
# difference between switch and if-else:
1. Syntax: Switch statements have a more concise syntax when dealing with multiple cases, while if-else statements can become verbose with many conditions.

2. Use Cases: Switch statements are typically used when you have a fixed set of possible values for a variable, while if-else statements are more flexible and can handle a wider range of conditions.

3. Performance: In some cases, switch statements can be more efficient than if-else statements, especially when dealing with a large number of cases, as they can be optimized by the compiler.

# == and .equals() in Java:
1. == operator: The == operator compares the references of two objects to check if they point to the same memory location. It is used for primitive data types and checks for value equality for them. For objects, it checks if both references point to the same object in memory.
ex: a->"Kislay"
    b->"Kislay"
    if a->"Kislay"<-b if both points same object then a==b true. but is points different object Kislay i.e. a->"Kislay" b->"Kislay" then a==b false. it will check reference point.

2. .equals() method: The .equals() method is used to compare the contents of two objects for equality. It is defined in the Object class and can be overridden by classes to provide a specific implementation for comparing the contents of objects. For example, the String class overrides the .equals() method to compare the actual characters in the string rather than their memory addresses.
ex: a->"Kislay"
    b->"Kislay"
    if a->"Kislay"<-b if both points same object or points different object Kislay i.e. a->"Kislay" b->"Kislay" true for both cases. it just check value.
*/
