import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pos. integer a: ");
        int a = input.nextInt();
        System.out.print("Enter pos. integer d: ");
        int d = input.nextInt();

        int quotient = a / d;
        int remainder = a % d;
        System.out.printf("The quotient is %d and the remainder is %d.", quotient, remainder);
    }
}
