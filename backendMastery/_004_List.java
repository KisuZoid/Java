package Java.backendMastery;

import java.util.List;
import java.util.ArrayList;

public class _004_List {
    public static void main(String[] args){
        int Length;

        List<String> arr = new ArrayList<>(); // List of String. List is an ordered collection (also known as a sequence). --> can store only string
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");
        System.out.println(arr);
        System.out.println(arr.get(1)); // using this method we can call the element at 1st indexed


        //for generic type --> can store any data types
        List<Object> arrObj = new ArrayList<>(); //as ArrayList is subset of List, so we can use ArrayList instead of List. "ArrayList<Object> arrObj = new ArrayList<>();"
        arrObj.add("Hello");
        arrObj.add(123);
        arrObj.add(true);
        arrObj.add(123.45);
        arrObj.add(null);
        System.out.println(arrObj);
        Length = arrObj.size(); //for length of List, we have to use size() method
        System.out.println("Size = " +  Length); //output : 5
        System.out.println(arrObj.get(1)); // using this method we can call the element at 1st indexed

        //Array
        int[] arrObj1 = {1,2,3};
        System.out.println(arrObj1); //output: [I@15db9742 --> not recommended to use this way. It gives the memory location of the array.
        System.out.println(arrObj1[1]); //element at indexed 1 => 2. as array is 0 indexed.


        Length = arrObj1.length; // to get the length of the array
        System.out.println("Length = " + Length); //output: Length = 3
        for (int i=0;i<Length;i++){ 
            System.out.println(arrObj1[i]); // printing all elements of array
        }
    }
}

/*
 * List<Integer> : means list of integer
 * here,
 *  List is a interface, it's a class.
 * 
 * for genereric:
 *  List<e> : means list of e, where e can be any data type that must be mentioned.
 * 
 * where as ArrayList is a class which implements List interface.
 * 
 */