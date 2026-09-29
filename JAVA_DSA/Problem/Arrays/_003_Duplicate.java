package Java.JAVA_DSA.Problem.Arrays;

public class _003_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // hasDuplicate(new int[]{1, 2, 3, 4});
        hasDuplicate(arr);
    }

    public static boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > 1){
                return true;
            }
        }
        return false;
    }
}
