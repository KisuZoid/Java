package Java.JAVA_DSA;

import java.util.Arrays;

public class _029_String{
    public static void main(String[] args) {
        String name = "Kislay Anand";
        System.out.println(name); 

        //Comparision of String
        String a = "Kislay";
        String b = "Kislay";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));


        // == : method, it checks both the value is same or not also, reference variable is pointing to same object or not
        // a == b : False => either a and b are not same or a and b are pointing to different object
        // a.equals(b) => only check the value that a is same as b or not.

        //How to create different objects of same value:
        String a_new = new String("Kislay");
        String b_new = new String("Kislay");
        System.out.println(a_new == b_new);
        System.out.println(a_new.equals(b_new));
        System.out.println(a_new.charAt(0));

        //output
        System.out.println(56);
    //or
        Integer num = new Integer(56); //-> use wrapper class to use other function
        System.out.println(num.toString());


        System.out.println("Kislay");


        System.out.println(new int[] {1, 2, 3, 4, 5});
        /*
            void java.io.PrintStream.println(Object x)
            Prints an Object and then terminates the line. This method calls at first String.valueOf(x) to get the printed object's string value, then behaves as though it invokes print(String) and then println().

            String java.util.Arrays.toString(int[] a)
            Returns a string representation of the contents of the specified array. The string representation consists of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). Returns "null" if a is null.
        */

        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4, 5}));
        /*
                String java.util.Arrays.toString(int[] a)
                Returns a string representation of the contents of the specified array. The string representation consists of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). Returns "null" if a is null.
        */


        String nameNew = null;
        System.out.println(nameNew);
    }
}

/*
How things working internally:
    Strings:
        String name = "Kislay Anand";
            String -> everything that starts with capital letter => class
                String is a class.
                name -> reference variable
                "Kislay Anand" -> Object 
                String -> Data Type

                String a = "Kislay"
                String b = "Kislay"

                Stack memory  Heap memory (a, b points to different object Kislay)
                a           ->  Kislay       
                b           ->  Kislay 
            or
                Stack memory  Heap memory (a, b points to same object Kislay)
                a           ->  Kislay       
                b           ->  Kislay

            Concepts: 
                String pool: 
                    separate memory structure inside heap.
                    use case: all the similar value inside pool won't recreate

                    Stack memory  Heap memory (a, b points to same object Kislay)
                    a           ->  Kislay       
                    b           ->  Kislay 

                    but as String are immutable => we can't modify object

                Immutability: String are immutable

                String a = "Kislay"
                String b = "Kislay"
                (both a and b are refering to same object, and string is immutable)

                a = "Anand" -> now "a" referes to object "Anand"

            //How to create different objects of same value:
                String a_new = new String("Kislay");
                String b_new = new String("Kislay");

                -> create these object outside the string pool but in heap

                Stack memory  Heap memory (a, b points to different object Kislay)
                a           ->  Kislay       
                b           ->  Kislay

            //Although, String is array of character, but in java we can't call a[0]
            --> rather use a.chatAt(index)
*/