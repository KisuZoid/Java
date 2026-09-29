package Java.JAVA_DSA;

public class _034_PatternSolving {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();

        pattern2(5);
        System.out.println();

        pattern3(5);
        System.out.println();

        pattern4(5);
        System.out.println();

        pattern5(5);
        System.out.println();

        pattern6(5);
        System.out.println();

        pattern28(5);
        System.out.println();

        pattern30(5);
        System.out.println();

        pattern31(4);
        System.out.println();

        
    }

    static void pattern1(int n){
        for (int row = 1; row <=n; row++){
            //for every row, run the col
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            //for every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 1; row <= n*2 -1; row++){
            int totalColInRow = row > n ? n*2 - row : row;

            for(int col = 1; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();

            // if (row <= n){
            //     for(int col = 1; col <= row; col++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }else{
            //     for(int col = 1; col <= n*2 - row; col++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
        }
    }

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row ; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row = 1; row <= n*2 -1; row++){
            int totalColInRow = row > n ? n*2 - row : row;
            int noOfSpaces = n - totalColInRow;

            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();


            
            // if (row <= n){
            //     for(int col = 1; col <= n - row; col++){
            //         System.out.print(" ");
            //     }
            //     for(int col = 1; col <= row; col++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }else{
            //     for(int col = 1; col <= row - n; col++){
            //         System.out.print(" ");
            //     }
            //     for(int col = 1; col <= n*2 - row; col++){
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++){
            int noOfSpaces = n - row;
            for(int s = 1; s <= noOfSpaces; s++){
                System.out.print("  ");
            }
                
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();


            // int totalColInRow = row*2 - 1;
            // for (int col = 1; col <= totalColInRow; col++){
            //     int print = col <= totalColInRow/2 + 1 ?  row + 1 - col : col + 1 - row; 
            //     System.out.print(print + " ");
            // }
            // System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = n*2 - 2;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


}

/*
outer for loop -> rows
inner for loop -> columns

1. no. of lines = no. of rows = no. of times outer loop will run
2. identify for every row no., how many column are there. or types of element in column
3. what do you need to print

Note: try to find formula relating rows and cols
*/
