package Java.JAVA_DSA;

import java.util.ArrayList;

//Array is sorted or not using recursion

public class _038_Q1_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8, 8, 6};
        System.out.println(helper(array));
        System.out.println(helper(array, 6));
        findAllIndex(array, 8, 0);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println(findAllIndex(array, 8, 0, newList));

        //or

        System.out.println(findAllIndex(array, 8, 0, new ArrayList<Integer>()));

        System.out.println(findAllIndex2(array, 8, 0));


    }

    static boolean helper(int[] arr){
        return sort(arr, 0);
    }
    static boolean sort(int[] arr, int i){
        if (arr.length - 1 == i){
            return true;
        }
        return (arr[i] < arr[i+1]) && (sort(arr, i+1));

        // if (arr[i] < arr[i+1]){
        //     return sort(arr, i+1);
        // }
        // return false;
    }

    //Linear search with recurssion
    static boolean helper(int[] arr, int target){
        return linearSearch(arr, target, 0);
    }
    static boolean linearSearch(int[] arr, int target, int index){
        if (arr[index] == target){
            return true;
        }
        if (index == arr.length-1){
            return false;
        }
        return (linearSearch(arr, target, index+1));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        } 
        findAllIndex(arr, target, index+1);
    }

    //second approach

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> newlist){
        if (index == arr.length){
            return newlist;
        }
        if (arr[index] == target){
            newlist.add(index);
        } 
        return findAllIndex(arr, target, index+1, newlist);
    }

    //VVI concept: Situation: 1. Return the list, 2. don't take it in argument
    //Challenges: Return type will be array list, but every call will generate new list!
    //solution: have to find something that pass the previous list --> when returing answer from below function call, append it will the existing value of list.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> newlist = new ArrayList<>();

        if (index == arr.length){
            return newlist;
        }

        //this will contain answer form this function call only
        if (arr[index] == target){
            newlist.add(index);
        } 
        //add answer from below calls
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        newlist.addAll(ansFromBelowCalls);

        return newlist;
    }

    

}
