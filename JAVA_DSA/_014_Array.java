package Java.JAVA_DSA;

public class _014_Array {
    public static void main(String[] args) {
        
    }
}

/*
notes:

Array: A data structure that can hold a fixed number of values of the same type, stored in contiguous memory locations. It allows for efficient access and manipulation of elements using an index.

synatx:
datatype[] variableName = new datatype[size];

store 5 integers in an array:
int[] arr = new int[5];

or

int[] arr = {1, 2, 3, 4, 5};

int[] arr; --> declaration of array. arr is a reference variable that can point to an array of integers. arr is getting defined in the stack memory, but it is not yet pointing to any array in the heap memory. It is just a reference variable that can point to an array of integers.

arr = new int[5]; --> initialization of array. Now arr is pointing to an array of integers in the heap memory. The array is created in the heap memory and arr is pointing to it. The array can hold 5 integers, and all the elements are initialized to 0 by default.

int[] arr = new int[5]; --> "int[] arr" int[] is datatype, arr is reference variable. on compile time, this part is executed at compile time and memory is allocated for reference variable arr in the stack memory. "new int[5]" is executed at runtime, and memory is allocated for the array of integers in the heap memory. The array can hold 5 integers, and all the elements are initialized to 0 by default. 

dynamic memory allocation: The size of the array can be determined at runtime, and memory is allocated accordingly. This allows for flexibility in handling data that may not have a predetermined size.
*/