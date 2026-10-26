package Java.JAVA_DSA;

public class _038_Q2_rotatedBS_Recurssion {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3}; //rotated Binary search, 5 is start, length=8 => 8-1/2th index is mid i.e. 3rd index -> 8 is mid, 3 is end.
        System.out.println(search(arr, 10, 0, arr.length-1));
        
        /*
        let search for 7 i.e. target = 7.

            if arr[s] <= arr[mid] --> i.e. we know that LHS part from mid is sorted array
                if key >= arr[s] && key <= arr[mid]
                    end = mid - 1
                else
                    s = m+1
            
            if key >= arr[m] && key <= arr[e]
                s = m+1
            
            else 
                e = m-1
        */
    }

    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if (arr[m] == target){
            return m;
        }

        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return search(arr, target, s, m-1);
            } else{
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
        
    }
}
