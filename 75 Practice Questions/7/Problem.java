import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();

        int total = a;
        for (int i = 1; i < b; i++){
            total *= a;
        }

        System.out.println(a + " to the power " + b + " is " + total);
    }
}
