package Java.JAVA_DSA;

import java.util.Arrays;
//swap the element using array
public class _015Q1_Swap{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before swap: " + Arrays.toString(arr));


        swap(arr, 1, 3);

        System.out.println("After Swap: " + Arrays.toString(arr));

        reverse(arr);
    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void reverse(int[] array){
        int end = array.length-1;
        int start = 0;

            // for (start = 0; start < array.length/2; i++){
            //     swap(array, start, end);
            //     end--;
            // }

            //or

            while(start<end){
                swap(array, start, end);
                start++;
                end--;
            }
        System.out.println("Reverse: " + Arrays.toString(array));
    }
}