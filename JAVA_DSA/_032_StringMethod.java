package Java.JAVA_DSA;

import java.util.Arrays;

public class _032_StringMethod {
    public static void main(String[] args) {
        String name = "Kislay Anand"; // --> everytime we perform any modification, it will create new object, won't change the Kislay Anand

        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray())); //Converts this string to a new character array.
        System.out.println(name.toLowerCase()); //Converts all of the characters in this String to lower case
        System.out.println(name.indexOf('K')); //Returns the index within this string of the first occurrence of the specified character.

        System.out.println("     Kislay    Anand     ".strip()); //Returns a string whose value is this string, with all leading and trailing white space removed.
        System.out.println(Arrays.toString(name.split(" "))); //Splits this string around matches of the given regular expression. Returns: the array of strings
    }
}
