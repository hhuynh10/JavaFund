import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] a = {3, 3, 3, 2, 2, 2, 2, 1, 5, 5, 5, 5, 5, 5, 4, 4};
        System.out.println(Arrays.toString(removeDUps(a)));
    }
    
    public static int[] removeDUps (int[] a){
        Arrays.sort(a);
        int uniqueNum = 1;
        for (int i = 1; i < a.length; i++){
            if (a[i] != a[i-1]){
                uniqueNum++;
            }
        }
        int[] arr = new int[uniqueNum];
        arr[0] = a[0];
        int index = 1;
        for (int i = 1; i < a.length; i++){
            if (a[i] != a[i-1]){
                arr[index] = a[i];
                index++;
            }
        }
        return arr;
    }
}