package Java.JAVA_DSA;

import java.util.Arrays;

public class _025_SelectionSort{
    public static void main(String[] args){
        int[] arr = {4, 3, 5, 1 , 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i=0; i < arr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
Selection sort:
    - Select the element and put it on correct position/index
TC: Worst case - O(N^2)
    Best case  - O(N^2)

    //performs well in small list

Stability: unstable algorithm
*/