package Java.JAVA_DSA;

import java.util.Arrays;

public class _019Q4_Search2DArray {
    public static void main(String[] args) {
        int[][] nums ={
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 34}
        };
        System.out.println(search(nums, 34));
        System.out.println(Arrays.toString(searchArr(nums, 34)));

    }

    static boolean search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                if (target == arr[row][column]){
                    return true;
                }
            }
        }
        return false;
    }

    //format of return value (row, column)
    static int[] searchArr(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                if (target == arr[row][column]){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


/*
Printing arrays directly in Java:

System.out.println(searchArr(nums, 34));

Output:
[I@4c40b76e

Reason:
searchArr() returns an int[] array. Java prints the array object's
reference value instead of its contents.

Breakdown:
[   -> array
I   -> int type
@   -> separator
4c40b76e -> hash/reference value

Type checking:
searchArr(nums,34)                    -> int[]
searchArr(nums,34).getClass().getName() -> [I
searchArr(nums,34).getClass().getSimpleName() -> int[]

To print actual values use:
Arrays.toString(searchArr(nums,34))

Example:
return new int[]{2,3};

Output:
[2, 3]

Flow:
searchArr() -> int[]
            -> printed directly -> [I@xxxxxx
            -> Arrays.toString() -> [2, 3]
*/