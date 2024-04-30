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

        if (a > 0 && b > 0 && c > 0){
            if (!(a >= b + c || b >= a + c || c >= a + b)){
                System.out.println("These CAN make a triangle.");
            } else {
                System.out.println("These CANNOT make a triangle.");
            }
        } else {
            System.out.println("These CANNOT make a triangle.");
        }
    }
}
