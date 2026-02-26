package Java.JAVA_DSA;
import java.util.Scanner;

public class _007Q8_Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press X or x

        int ans = 0;
        while (true) {
            //take operator as input
            System.out.print("Operator: ");
            char op = in.next().trim().charAt(0); 

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                else if (op == '-'){
                    ans = num1 - num2;
                }
                else if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("unvalid");
                    }
                }
                else if (op == '*'){
                    ans = num1 * num2;
                }
                else if (op == '%'){
                    ans = num1 % num2;
                }
                else {
                    System.out.println("NA");
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("wrong operator chosen, try again!");
            }
            System.out.println("Result " + ans);
        }
    }
}