package Java.JAVA_DSA;

import java.util.ArrayList;

public class _019Q5_EvenNumDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(EvenDigit(nums));
        System.out.println(EvenDig(nums));
        System.out.println(EvenDigitEnhance(nums));
    }

    static int EvenDigit(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            Integer element = arr[i];

            if (element.toString().length() % 2 == 0){
                result.add(element);
            }
        }
        return result.size();
    }

    //enhance forloop
    static int EvenDigitEnhance(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int element : arr){
            // if (element.toString().length() % 2 == 0){ --> for this, Integer element is required
            //     result.add(element);
            // } 

            //or

            if (String.valueOf(element).length() % 2 == 0){
                result.add(element);
            }
        }
        return result.size();
    }

    static int EvenDig(int[] arr){
        int count = 0;
        for (int element : arr){
            if (String.valueOf(element).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
