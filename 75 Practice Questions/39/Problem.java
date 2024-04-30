import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int 1: ");
        int int1 = input.nextInt();
        System.out.print("Enter an int 2: ");
        int int2 = input.nextInt();
        System.out.print("Enter an int 3: ");
        int int3 = input.nextInt();

        int sum = int1 + int2 + int3;
        if (sum % 3 == 0 && sum % 5 == 0){
            sum *= 3;
        } else if (sum % 3 == 0 || sum % 5 == 0){
            sum *= 2;
        }

        System.out.println("Result: " + sum);
    }
}
