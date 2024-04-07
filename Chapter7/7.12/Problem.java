//import API's needed here:
import java.util.Scanner;
public class Problem 
{  
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int[] arrInput = new int[10];
        
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < arrInput.length; i++){
            arrInput[i] = input.nextInt();
        }

        for (int i = 0; i < reverse(arrInput).length; i++){
            System.out.print(reverse(arrInput)[i] + " ");
        }
    } //closing main method
    
    public static int[] reverse(int[] arr){
        int[] reversedArr = new int[arr.length];
        for (int i = 0, j = reversedArr.length-1; i < arr.length; i++, j--){
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }
} //closing class header
