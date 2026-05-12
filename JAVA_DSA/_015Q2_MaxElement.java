package Java.JAVA_DSA;

public class _015Q2_MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 45, 32, 28, 15, 40, 521, 45, 55};
        System.out.println(max(arr));
        System.out.println(max(arr, 4, 41));

    }

    static int max(int[] array){
        // int maximum = 0;

        // for(int i = 0; i < array.length; i++){
        //     if (maximum > array[i]){
        //         continue;
        //     }
        //     else{
        //         maximum = array[i];
        //     }
        // }

        //or

        int maximum = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }

        return maximum;
    }

    static int max(int[] array, int index1, int index2){
        int maximum = 0;

        if (index2 <= array.length){
            for(int i = index1; i < index2; i++){
                if (maximum > array[i]){
                    continue;
                }
                else{
                    maximum = array[i];
                }
            }
            return maximum;
        }
        else{
            System.out.println("Boundary");
            return -1;
        }

    }
    
}