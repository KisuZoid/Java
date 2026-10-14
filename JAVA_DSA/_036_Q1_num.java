package Java.JAVA_DSA;

public class _036_Q1_num {
    public static void main(String[] args) {
        func1(3);
        funcN(3);
        funcBoth(3);

        System.out.println(factorial(5));
        System.out.println(sum(10));
        System.out.println(sumOfDigits(706));
        System.out.println(productOfDigits(25));

        rev(13542);
        rev2(13542);
        System.out.println(rev3(13542));

        System.out.println(palin(303));

        zeros(1023500030);
        System.out.println(countZero(1023500030));
    }

    //concept n-- vs --n 
    /*
        n-- => pass the value of n first then subtract
        --n => subtract first then pass
    */


    // N to 1
    static void funcN(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funcN(n-1);
    }

    // 1 to N
    static void func1(int n){
        if (n == 0){
            return;
        }

        func1(n-1);
        System.out.println(n);
    }

    static void funcBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }

    static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int sumOfDigits(long n){
        /*
            N = 1324
            N/10 = 132
            N%10 = 4
        */

        if (n/10 == 0){
            return (int) n%10;
        }

        return (int)((n%10) + sumOfDigits(n/10));
    }

    static int productOfDigits(long n){
        /*
            N = 1324
            N/10 = 132
            N%10 = 4
        */

        if (n/10 == 0){
            return (int) n%10;
        }

        return (int)((n%10) * productOfDigits(n/10));
    }

    //reverse the number
    static int rev(int n){
        if (n/10 == 0){
            System.out.println(n%10);
            return n%10;
        }
        System.out.print(n%10);
        return rev(n/10);
    }

    static int sum = 0;
    static int rev2(int n){
        if (n/10 == 0){
            System.out.println(sum*10 + n%10);
            return n%10;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        return rev2(n/10);
    }

    static int rev3(int n){
        //sometimes might need some additional variables in the argument, in thta case, make another function
        
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    //palindrome
    static boolean palin(int n){
        return n == rev3(n);
    }

    //count 0's 
    static int count = 0;
    static void zeros(int n){
        if (n%10 == n){
            if (n == 0){
                count++;
            }
            System.out.println(count);
            return;
        }
        int rem = n%10;
        if (rem == 0){
            count++;
        } 
        zeros(n/10);
    }

    //important concept of count
    static int countZero(int n){
        return helperZero(n, 0);
    }

    // special pattern how to pass a value into above calls -> return same value to above function calls
    private static int helperZero(int n, int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem == 0){
            return helperZero(n/10, c+1);
        }
        return helperZero(n/10, c);
    }
}
