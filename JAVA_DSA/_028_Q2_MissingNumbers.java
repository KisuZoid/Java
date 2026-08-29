// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
/*
    [1, N] => index = value -1
    [0, N] => index = value
*/

import java.util.ArrayList;
import java.util.List;

public class _028_Q2_MissingNumbers {

    public List<Integer> findDisappearedBumbers(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
