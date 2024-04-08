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

                System.out.println(gcd(userList));

         } //closing main method

         public static int gcd(int[] numbers) {
                int result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    result = gcdHelper(result, numbers[i]);
                }
                return result;
            }
        
            public static int gcdHelper(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }

        public static int lcm(int[] numbers){
                int product = 1;
                for (int i = 0; i < numbers.length; i++){
                        product *= numbers[i];                
                }
                int result = product / gcd(numbers);
                return result;
        }
} //closing class header