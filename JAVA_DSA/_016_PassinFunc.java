package Java.JAVA_DSA;
import java.util.Arrays;

public class _016_PassinFunc {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums); //gives the memory address of the array
        System.out.println(nums[0]); //gives the value at index 0 of the

        System.out.println(Arrays.toString(nums));

        //change the 0th index --> as reference variable is pointing to the same array in the memory, it will change the value at 0th index of the original array. as both of them are pointing to the same array in the memory.

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}

//arr and nums are reference variables which are pointing to the same array in the memory. so when we change the value at 0th index of arr, it will change the value at 0th index of nums as well. as both of them are pointing to the same array in the memory.

//arr and nums are in stack memory and they are reference variables which are pointing to same array in heap memory.
