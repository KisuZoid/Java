package Java.JAVA_DSA;
//find number of times some digit occur using / and %. 
public class _007Q6_CountOccurence {
    public static void main(String[] args) {
        int n = 1285757879;
        // %10 => last digit
        // /10 => rest of the digit except last digit

        int count = 0;
        while (n > 0){
            int rem = n%10;
            if (rem == 7){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
