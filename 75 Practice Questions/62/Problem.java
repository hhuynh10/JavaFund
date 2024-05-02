import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n and k: ");
        int n = input.nextInt();
        int k = input.nextInt();
        
        while (n > 0 && k > 0) {
            for (int i = 0; i < k; i++){
                System.out.print(n + " ");
            }
            System.out.println();
            System.out.print("Enter n and k: ");
            n = input.nextInt();
            k = input.nextInt();
        }
    }
}
