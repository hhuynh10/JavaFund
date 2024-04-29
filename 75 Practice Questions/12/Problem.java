import java.util.Scanner;
public class Problem {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int count = 0;

        if (max == a){
            count++;
        }
        if (max == b){
            count++;
        }
        if (max == c){
            count++;
        }

        System.out.println("The largest integer " + max +
                        " was entered " + (count == 1 ? "once." : count == 2 ? "twice." : "three times."));
    }
    
}
