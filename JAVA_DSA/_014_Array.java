package Java.JAVA_DSA;

import java.util.Scanner;
import java.util.Arrays;

public class _014_Array {
    public static void main(String[] args) {

        // take input from user and store in array.
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        // index started from 0 to 4
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // enhanced for loop
        for (int num : arr) {
            System.out.println(num);
        }

        // using toString method
        System.out.print(Arrays.toString(arr));
    }
}

/*
notes:

Array: A data structure that can hold a fixed number of values of the same type.

syntax:
datatype[] variableName = new datatype[size];

int[] arr = new int[5];

or

int[] arr = {1, 2, 3, 4, 5};

points:
1. array objects are in heap memory
2. reference variables are in stack memory
3. dynamic memory allocation
4. arrays may not be continuous in memory depending on JVM

new:
used to create objects and allocate memory in heap memory.

null:
represents absence of value/reference.
*/