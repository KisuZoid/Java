package Java.JAVA_DSA;

import java.util.Scanner;
import java.util.Arrays;

public class _015_ArrayMultiDim {
    public static void main(String[] args) {
        //assume like matrix
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2]; //--> if we haven't added value => default is 0 for both 1d or 2d array in case of int datatype. and for String datatype => null is default for both 1d or 2d array. 

        System.out.println("provide input ");
        for (int row = 0; row < arr.length; row ++){
            for (int column = 0; column < arr[row].length; column++ ){
                arr[row][column] = in.nextInt();
            }
        }

//output:

        for (int row = 0; row < arr.length; row ++){
            for (int column = 0; column < arr[row].length; column++ ){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

//or 
        //toString method
        for (int row = 0; row < arr.length; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}

/*
    1 2 3 --> rows
    4 5 6 
    7 8 9
    |
    column

    int[][] arr = new int[i][j]; --> i : number of row
                                    j : number of column
                                    
or 

    int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}          
    };

    even individiual one can have different number of element

    int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}          
    };

    arr.length --> gives number of rows
*/