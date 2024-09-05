package Chapter9.Problem4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random input = new Random();
        
        for (int i = 0; i < 50; i++){
            int number = input.nextInt(1000);
            if (number > 100) i--;
            else {
                System.out.println((i+1) + ": " + number);
            }
        }
    }
}
