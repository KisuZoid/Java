package Java.JAVA_DSA;

public class _019Q3_MinimumNum {
    public static void main(String[] args) {
        int[] nums = {18, 29, 46, 28, 11, 59, 75, 180, 12, 03, 13};
        System.out.println(max(nums));
        System.out.println(min(nums));

    }

    static int max(int[] arr){
        int value = arr[0];
        for (int element : arr){
            if (value < element){
                value = element;
            }
        }
        return value;
    }

    static int min(int[] arr){
        int value = arr[0];
        for (int element : arr){
            if (value > element){
                value = element;
            }
        }
        return value;
    }
}
