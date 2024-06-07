import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        String str = "gsrvefef";
        int[] arr = tally(str);
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + ": " + arr[str.charAt(i) - 'a']);
        }
    }

    public static int[] tally(String str){
        int[] res = new int[26];
        for (int i = 0; i < str.length(); i++){
            res[Character.toLowerCase(str.charAt(i)) - 'a']++;
        }
        return res;
    }
}
