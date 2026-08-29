import java.util.Arrays;

public class _026_InsertionSort {
    public static void main(String[] args){
        int[] arr = {4, 5, 1, 2, 3};
        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i=0; i< arr.length -1; i++){
            for (int j=i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


/*
    For every index, put that index element at correct index of LHS.
    
    5, 3, 4, 1, 2

    i=0: 3,5 (sort till index 1)
    i=1: 3, 4, 5 (sort till index 2)
    i=2: 1, 3, 4, 5 (sort till index 3)
    i=3: 1, 2, 3, 4, 5 (sort till index 4)

    i from 0 -> N-2; N -> length of array
    j = i+1, j>0, j--

    Complexity:
        Worst case: O(N^2)
        Best case: O(N)

    Why use:
    - Adaptive: steps got reduced if array is sorted. (No. of steps reduced compared to bubble sort)
    - Stable
    - Used for smaller values of N => works good when array if partially sorted. -> part in hybrid sorting algorithm.
*/