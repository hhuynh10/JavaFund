//import API's needed here:
import java.util.Scanner;
public class Problem 
{  
        public static void main(String args[ ]) 
        {       
                int start;
                int end;
                int[] userList;

                Scanner input = new Scanner(System.in);
                System.out.print("Enter start number: ");
                start = input.nextInt();
                System.out.print("Enter end number: ");
                end = input.nextInt();
                System.out.print("How many numbers to exclude: ");
                userList = new int[input.nextInt()];
                System.out.print("Enter numbers to exclude: ");
                for (int i = 0; i < userList.length; i++){
                        userList[i] = input.nextInt();
                }

                for (int i = 0; i < 44; i++){
                        if ((i+1) % 15 != 0){
                                System.out.printf("%-4d", getRandom(start, end, userList));
                        } else {
                                System.out.printf("%-4d\n", getRandom(start, end, userList));
                        }
                }
                System.out.println(getRandom(start, end, userList));
         } //closing main method
        
        public static int getRandom(int start, int end, int[] numbers){
                int number;
                do {
                        number = (int)(Math.random() * (end - start + 1)) + start;
                } while (contain(number, numbers));
                
                return number;
        }

        public static boolean contain(int number, int[] numbers){
                for (int i = 0; i < numbers.length; i++){
                        if (numbers[i] == number){
                                return true;
                        }
                }
                return false;
        }
} //closing class header
