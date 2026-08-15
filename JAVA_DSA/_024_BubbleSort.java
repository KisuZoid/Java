package Java.JAVA_DSA;
import java.util.Arrays;

public class _024_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 9, 7, 8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if not sorted for a particular value of i, it means the array is sorted hence step
            if (!swapped){ // !false = true
                break;
            }
        }
    }
}

/*
for first round, largest element goes into end.
for second pass, second largest element goes into the second to last index.
.
.
.
for Nth pass, --> array will be sorted

TC: O(N) best case --> array is sorted 
    O(N^2) worst case --> sorted in opposite order
SC: O(1) --> no extra space is required, i.e. copying the array etc, not required
As the size is growing, the no. of comparision also growing --> time complexity.

Note: when j never swaps for Nth pass --> array is sorted, end the program

Aka "sinking sort or exchange sort"

1. Stable Sorting

A sorting algorithm is stable when equal elements maintain their original order after sorting.
Examples:
Bubble Sort
Insertion Sort
Merge Sort
Counting Sort

Example:
Before: A(80), B(70), C(80)
After: B(70), A(80), C(80)
→ A remains before C, so it is stable.

2. Unstable Sorting

A sorting algorithm is unstable when equal elements may change their original order.
Examples:
Selection Sort
Quick Sort
Heap Sort

Example:
Before: A(80), B(70), C(80)
After: B(70), C(80), A(80)
→ A and C changed order, so it is unstable.

*/
