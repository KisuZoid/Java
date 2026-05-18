package Java.JAVA_DSA;

import java.util.ArrayList;

public class _019Q5_EvenNumDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(EvenDigit(nums));
        System.out.println(EvenDig(nums));
        System.out.println(EvenDigitEnhance(nums));
    }

    //convert into string, take length
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

    //count digits in a number

    static int findNum(int[] arr){
        int count = 0;

        for (int element : arr){
            if (CheckEven(element)){
                count++;
            }
        }
        return count;
    }

    static int digit(int val){
        int count = 0;
        while (val > 0){
            count++;
            val = val/10;
        }
        return count;
    }

    static boolean CheckEven(int num){
        int numberOfDigits = digit(num);
        // if (numberOfDigits % 2 == 0){
        //     return true;
        // }
        // return false;

        //or

        return numberOfDigits % 2 == 0;
    }
}
