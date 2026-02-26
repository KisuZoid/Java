package Java.JAVA_DSA;
//find number of time some digit occur
public class _007Q5_CountOccurrence {
    public static void main(String[] args) {
        //define number
        int num = 1234556765;
        
        //convert to string
        String Num = String.valueOf(num);

        //find count
        for (int i = 0; i <= Num.length()-1; i++){
            char k = Num.charAt(i);

            //remove duplicates
            //already counted -> skip else keep
            // remove duplicates: check only BEFORE i
            boolean alreadyCounted = false;
            for (int x = 0; x < i; x++) {  
                if (Num.charAt(x) == k) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            int count = 0;
            for (int j = 0; j<=Num.length()-1; j++){
                if (k == Num.charAt(j)){
                    count++;
                }
            }
            System.out.println("Value of " + k + " is " + count);
        }
    }
}
