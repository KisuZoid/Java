package Java.JAVA_DSA;

public class _037_Ques_Steps {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    /*
     * Given an integer num, return the number of steps to reduce it to zero.
     * 
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     */

    public static void main(String[] args) {
        System.out.println(steps(14));
    }

    static int steps(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }
        if (n%2 == 0){
            return helper(n/2, count+1);
        }
        else{
            return helper(n-1, count+1);
        }
    }
}
