package Java.JAVA_DSA;

import java.util.Arrays;

public class _038_Q5_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,4,5,6,7,8,846,33};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {4,3,4,5,6,7,8,846,33}; 
        Sort(arr1, arr1.length, 0, 0);
        System.out.println(Arrays.toString(arr1));

    }

    static int largestIndex = 0;
    static void selectionSort(int[] arr, int r, int c, int largest){
        if (r == 0){
            return;
        }
        if (c<=r){
            if (largest < arr[c]){
                largest = arr[c];
                largestIndex = c;
            }
            selectionSort(arr, r, c+1, largest);
        } else{
            //swap
            int temp = arr[r];
            arr[r] = arr[largestIndex];
            arr[largestIndex] = temp;

            selectionSort(arr, r-1, 0, 0);
        }
    }

    //or

    static void Sort(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c<r){
            if (arr[c] > arr[max]){
                Sort(arr, r, c+1, c);
            }else{
                Sort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            Sort(arr, r-1, 0, 0);
        }
    }
}
