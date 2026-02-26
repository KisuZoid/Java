package Java.JAVA_DSA;
//reverse the number
public class _007Q7_Reverse {
    public static void main(String[] args) {
        int num;
        String result1, result2;
        //using Loops
        num = 12345;
        result1 = "";
        String x = String.valueOf(num);
        for (int i = x.length()-1; i >=0; i--){;
            result1 += x.charAt(i);
        }
        System.out.println("using Loop " + result1);

        //using modulo 
        num = 12345;
        result2 = "";
        while(num>0){
            result2 += num%10;
            num /= 10;
        }
        System.out.println("using modulo " + result2);
    }
}
