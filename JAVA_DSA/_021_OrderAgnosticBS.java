package Java.JAVA_DSA;
//we don't know array is sorted in ascending or descending order

public class _021_OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = {-18, -1, 0, 2, 3, 4, 6, 7, 8, 9, 25, 45, 67, 68, 78, 89, 99};
        int[] arrDes = {90, 80, 70, 60, 50, 40, 30, 20, 10, 5, 1, 0, -1, -2, -18, -27};

        System.out.println(orderAgnosticBS(arrAsc, 0));
        System.out.println(orderAgnosticBS(arrDes, 10));
        
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int midIndex = start + (end-start)/2;
            if (target == arr[midIndex]){
                return midIndex;
            }

            if (isAsc){
                if (target < arr[midIndex]){
                    end = midIndex - 1;
                }else{
                    start = midIndex + 1;
                }
            }else{
                if (target > arr[midIndex]){
                    end = midIndex - 1;
                }else{
                    start = midIndex + 1;
                }
            }
        }
        return -1;
    }
}

/*
if start > end => increasing order sorted
if start < end => decresing order sorted

if we search any two, might be a case or being same like arr = [3, 3, 3, 4, 5, 6, 7], for first 2 element check, it gives equal. hence, check extremes.
*/


