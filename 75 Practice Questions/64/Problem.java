import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        int[] arr = {41, 38, 75, 98, 26, 51, 118, 13};
        System.out.println(Arrays.toString(lastDigits(arr)));
    }
    
    public static int[] lastDigits (int [] myNums){
        int[] arr = new int[10];
        for (int i = 0; i < myNums.length; i++){
            int cal = myNums[i] % 10;
            arr[cal]++;
        }
        return arr;
    }
}
