package Java.JAVA_DSA;

public class _020_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -1, 0, 2, 3, 4, 6, 7, 8, 9, 25, 45, 67, 68, 78, 89, 99};
        int BS = binarySearch(arr, -1);
        System.out.println(BS);
        
    }

    //return index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start, end, midIndex;
        start = 0;
        end = arr.length-1;

        while (start <= end){
            //find the middle element
            // midIndex = (start+end)/2; --> might be possible that start + end exceeds the range of int in java

            midIndex = start + (end-start)/2; //better approach, as same as (start+end)/2

            if (target < arr[midIndex]){
                end = midIndex - 1;
            }else if (target > arr[midIndex]){
                start = midIndex + 1;
            }else{
                //ans found
                return midIndex;
            }
        }
        return -1;

    //my code
        // midIndex = (start+end)/2;
        // middle = arr[midIndex];

        // while (target != middle){
        //     if (arr[start] > arr[end]){
        //             return -1;
        //     }
        //
        //         midIndex = (start+end)/2;
        //         middle = arr[midIndex];
        //
        //     if (target < middle){
        //         end = midIndex-1;
        //     }
        //     else if (target > middle) {
        //         start = midIndex + 1;
        //     }
        // }
        // return midIndex;
    }
}

//For sorted array.
/*
    arr = {2, 4, 5, 6, 8, 10, 45, 65, 84, 99} --> ascending sorted
    target = 65

    algo:
        total indices: 9

        1. find the midde element. --> let x
            & array is sorted ascending order.
        2. if mid element (x) < target --> rearch right (new start mid + 1th element) else left. as left side (new end mid - 1th element) of x, element are smaller than x, vice-versa right side element is greater than x. 
        3. repeat until, middle element == target element --> answer 
        4. if start > end : element now found

        dry run:
        total indices = 9 (0-9) => half 0+9/2 => 4.5 i.e 4
        4th element --> 8 < target (65) => right

        now we check: {10, 45, 65, 84, 99} --> new start 10
        total indices = 4 from 5-9=> half 5+9/2 => 7
        7TH element --> 65 == target => answer.


    for descending array: arr = {90, 80, 70, 60, 50, 40, 30, 20, 10, 5, 1, 0}
        target > middle => left and end = mid -1
        target < middle => right and start = mid + 1


    Time Complexity:
        best case: O(1)
        worst case: O(logN)

*/