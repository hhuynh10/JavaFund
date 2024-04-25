import java.util.Arrays;

public class Problem {
    public static void main (String [] args){
        int size = 4;
        int [] freq = new int[size];
        char [] text = new char[size];

        for (int i = 0; i < freq.length; i++){
            freq[i] = (int)(Math.random() * 10);
            text[i] = (char)((int)(Math.random() * 26) + 97);

        }
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(text));
        System.out.println(Arrays.toString(repeatChars(freq, text)));
    }

    public static char [] repeatChars(int [] freq, char [] text) {
        int length = 0;
        for (int i = 0; i < freq.length; i++){
            length += freq[i];
        }
        char[] result = new char[length];
        int currentIndex = 0;
        for (int i = 0; i < freq.length; i++){
            for (int j = 0; j < freq[i]; j++){
                result[currentIndex] = text[i];
                currentIndex++;
            }
            
        }
        return result; 
    }
}
