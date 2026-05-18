package Java.JAVA_DSA;

public class _019_LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3 , 4, 5, 6, 7, 8, 9};
        int target = 19;
        int ans = linearSearch(nums, target);

        if (ans == -1){
            System.out.println("Not found");
        }
        else if (ans == -2){
            System.out.println("NULL array");
        }
        else{
            System.out.println(ans);
        }

        System.out.println(LS(nums, target));
        System.out.println(LS_Bool(nums, target));

        
    }

    //Search in the array: return the index if item found, else return -1.
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -2;
        }

        //run for loop
        for (int index = 0; index < arr.length; index++){
            //check element at every index if it is equas to target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        //this line will execute if none of the return statements above hava executed -> target not found
        return -1; //--> as index value can't be negative hence, no conflict with return index.
    } 

    //Liner search and return element
    static int LS(int[] arr, int target){
        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        
        // return -1; --> if element is -1 then it conflicts with return -1 and return element
        //target not found
        return Integer.MAX_VALUE;
    }

    //linear search and return true and false
    static boolean LS_Bool(int[] arr, int target){
        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}

// Linear Search
/*
time complexity: -> how time grows as input grows.
    best case: O(N)
    worst case: O(1)

Space complexity: O(1)

LS: Search one by one.
*/

//LS() --> better approach
/*
static Integer LS(int[] arr, int target){
    for(int element : arr){
        if(element == target){
            return element;
        }
    }
    return null;
}
*/