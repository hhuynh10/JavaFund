import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive integer n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int product = 1;
        System.out.printf("Enter %d integers: ", n);
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
            product *= arr[i];
        }

        if (sum > product){
            System.out.println("SUM");
        } else if (sum < product){
            System.out.println("PRODUCT");
        } else {
            System.out.println("TIE");
        }
    }
}
