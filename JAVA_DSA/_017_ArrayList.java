package Java.JAVA_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class _017_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        //adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        //using loop to add elements to the ArrayList
        for(int i = 0; i<5; i++){
            int element = in.nextInt();
            list.add(element);
        }

        System.out.println("add method: " + list);

        //removing elements from the ArrayList
        list.remove(1); //removing element at index 1
        System.out.println("remove method: " + list);

        //getting elements from the ArrayList
        int element = list.get(0); //getting element at index 0
        System.out.println("get method: " + element);

        //setting elements in the ArrayList
        list.set(0, 100); //setting element at index 0 to 100
        System.out.println("set method: " + list);

        //size of the ArrayList
        int size = list.size();
        System.out.println("size method: " + size);

        //contains method
        boolean contains = list.contains(30);
        System.out.println("contains method: " + contains);

        //clearing the ArrayList
        list.clear();
        System.out.println("clear method: " + list);

        //checking if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("isEmpty method: " + isEmpty);

        in.close();

    }
}

/*
//Syntax: 

ArrayList<E> variable_name = new ArrayList<>(default size);
E(generics) --> this generics is used to specify the type of elements that the ArrayList will hold. It can be any object type, such as String, Double, etc. We have to use wrapper classes for primmitive datatypes.

default size is optional, if not provided it will default to 10. --> means it hold 10 elements, it will automatically resize itself to hold more elements, but if we provide less than 10, it will hold only that many elements, and if we try to add more than that, it will automatically resize itself to hold more elements.

used to store dynamic data, which means we can add or remove elements from the list without worrying about the size of the list. It automatically resizes itself when needed.

advanced features of ArrayList:
1. Dynamic resizing: ArrayList automatically resizes itself when the number of elements exceeds its current capacity. This means that you can add as many elements as you want without worrying about the underlying array size.
2. Random access: ArrayList allows for fast random access to elements using an index. This means that you can quickly retrieve any element from the list by its position.
3. Built-in methods: ArrayList provides a wide range of built-in methods for adding, removing, and manipulating elements in the list. Some common methods include add(), remove(), get(), set(), size(), and clear().
*/
