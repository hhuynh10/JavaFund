//import API's needed here:
import java.util.Scanner;

public class Problem 
{  
        public static void main(String args[ ]) 
        {       
                int[] userList;
                Scanner input = new Scanner(System.in);

                System.out.print("How many numbers: ");
                userList = new int[input.nextInt()];

                System.out.print("Enter the numbers: ");
                for (int i = 0; i < userList.length; i++){
                        userList[i] = input.nextInt();
                }

                System.out.println(gcdHelper(5, 15));

         } //closing main method

        public static int gcd(int[] numbers) {
                int result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    result = gcdHelper(result, numbers[i]);
                }
                return result;
            }
        
            public static int gcdHelper(int a, int b) {
                int max = Math.max(a, b);
                int gcd = 1;
                for (int i = 1; i <= max; i++) {
                    if (a % i == 0 && b % i == 0) {
                        gcd = i;
                    }
                }
                return gcd;
            }
} //closing class header