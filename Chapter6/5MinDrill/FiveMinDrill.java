//import API's needed here:
import java.util.Scanner;
public class FiveMinDrill 
{  
        public static void main(String args[ ]) 
        {       
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number 1: ");
                int num1 = input.nextInt();
                System.out.println("Enter number 2: ");
                int num2 = input.nextInt();
                System.out.println("Enter number 3: ");
                int num3 = input.nextInt();
                System.out.println("Enter number 4: ");
                int num4 = input.nextInt();
                System.out.println("Enter number 5: ");
                int num5 = input.nextInt();
                
                countEights(num1, num2, num3, num4, num5); 
         } //closing main method

        public static int countEights(int a, int b, int c, int d, int e){
                int count = 0;
                
                String aString = "" + a;
                String bString = "" + b;
                String cString = "" + c;
                String dString = "" + d;
                String eString = "" + e;
                String fString = "" + aString.length() + "#" + aString + bString.length() + "#" + bString + cString.length() + "#" + cString + dString.length() + "#" + dString + eString.length() + "#" + eString;
                
                int i = 0;
                while (i < fString.length()){
                        int j = i;
                        while (fString.charAt(j) != '#'){
                                j++;
                        }
                        int lengthOfString = Integer.parseInt(fString.substring(i, j));
                        String subString = fString.substring(j + 1, j + 1 + lengthOfString);
                        if (subString.equals("-8") || subString.equals("8")){
                                count++;
                        }
                        i = j + 1 + lengthOfString;
                }
                System.out.println(count);
                return count;
        }
} //closing class header