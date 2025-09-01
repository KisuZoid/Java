package Java.backendMastery.problem;

public class _001_Loops {
    // using for loop, make a  triangle
    /*
     *      #
     *      ##
     *      ### 
     * 
     *        #
     *       ##
     *      ###
     * 
     *      #
     *     ### 
     *    #####
     */
    public static void main(String[] args){
        for (int i = 1; i < 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();//new line

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                    System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();//new line

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                    System.out.print("x");
            }
            System.out.println();
        }
            
    }
}
