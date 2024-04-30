import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        int sum = a + b + c;
        if (sum % 8 == 0){
            if (sum % 10 == 8 || sum % 10 == 4) {
                System.out.println("blue");
            } else {
                System.out.println("red");
            }
        } else {
            System.out.println("green");
        }
    }
}
