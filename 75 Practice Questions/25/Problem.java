import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        char[] x = {'E', 'Q', 'A', 'F', 'G', 'O', 'C', 'C', 'U', 'U', 'M','M'};
        char[] y = {'B', 'Z', 'B', 'U', 'U', 'H', 'H', 'O', 'A', 'E', 'A', 'E', 'P', 'A'};

        System.out.println(Arrays.toString(vowelConsonant(x, y)));
    }

    public static char [] vowelConsonant(char [] x, char [] y) {
        String str = "";
        for (int i = 0; i < x.length; i++){
            if ((x[i] == 'A' || x[i] == 'E' || x[i] == 'I'|| x[i] == 'O'|| x[i] == 'U') && x[i] != 'Y'){
                str += x[i];
            }
        }
        for (int i = 0; i < y.length; i++){
            if (!(y[i] == 'A' || y[i] == 'E' || y[i] == 'I'|| y[i] == 'O'|| y[i] == 'U') && y[i] != 'Y'){
                str += y[i];
            }
        }

        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}