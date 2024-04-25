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

        int count = 0;
        count += isOdd(a) + isOdd(b) + isOdd(c);

        System.out.println((count > 0 ? count + " " : "No ") + "integers were odd.");
    }   

    public static int isOdd(int num){
        int count = 0;
        if (num % 2 != 0){
            count++;
        }
        return count;
    }
}
