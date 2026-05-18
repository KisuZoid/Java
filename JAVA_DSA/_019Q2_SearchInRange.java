package Java.JAVA_DSA;

public class _019Q2_SearchInRange{
    public static void main(String[] args){
        String val = "Kislay";
        char target = 'K';
        int start = 0;
        int end = 3;

        boolean answer = search(val, target, start, end);
        System.out.println(answer);
    }

    static boolean search(String value, char target, int start_index, int end_index){
        for (int i = start_index; i < end_index; i++){
            if (value.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}