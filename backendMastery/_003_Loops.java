package Coding.backendMastery;

public class _003_Loops {
    public static void main(String[] args) {
        // 1. For Loop : for(initialize; condition; increment/decrement){//code}
        for(int i = 0;i < 5; i++){
            System.out.println(i);
        }

        // 2. While Loop : while(condition){code}
        int j = 0;
        while (j < 5){
            System.out.println(j);
            j++;
        }

        //do while loop : do{code}while(condition);
        int k = 0;
        do {
            System.out.println(k);
            k++;
            } while (k < 5); //it will run the code at least once
    }
}

//operators:
/*
 * i++; //post increment: first print then increment
 * i--; //post decrement: first print then decrement
 * --i; //pre decrement: decrement first then print
 * ++i; //pre increment: increment first then print
 * 
 * i+=3; // i = i + 3
 * i*=3; // i = i * 3
 * i-=3; // i = i - 3
 * 
 * == : equals
 * != : not equals
 * <= : less than equals
 * >= : greater than equals
 * 
 * = : assignment operator
 * + : addition operator
 * - : substraction operator
 * * : multiplication operator
 * / : division operator --> provide quotient
 * % : modulus operator --> provide remainder
 */
