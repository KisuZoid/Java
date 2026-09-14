package Java.JAVA_DSA;

public class _031_StringPerformace {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series = series + ch; //series += ch
        }

        System.out.println(series);

        //for each loop, coping the previous string and add now character -> for each loop create new object as string is immutable.
        /*
        object: 
        a, ab, abc, abcd, abcde, ..., abcdefghijklmnopqrstuvwxyz --> new object being created everytime not modifying the previous string as string is immutable

        => so much memory wastage, also all of previous series object are dereferenced(nothing points to the object)

        Time complexity: O(N^2)
        */

        //solution: can we use a datatype that wont create new object rather modify previous object => StringBuilder() --> mutable

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch); //Appends the specified character to this Appendable.
        }
        System.out.println(builder.toString()); //Returns a string containing the characters in this sequence in the same order as this sequence. The length of the string will be the length of this sequence.

        System.out.println(builder.deleteCharAt(0)); //Removes the char at the specified position in this sequence. 
        System.out.println(builder.reverse());

    }
}
