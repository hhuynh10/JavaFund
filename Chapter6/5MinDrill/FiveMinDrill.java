//import API's needed here:
import java.util.Scanner;
public class FiveMinDrill 
{  
        public static void main(String args[ ]) 
        {       
                // Instantiate Scanner class and obtain user input for the 5 numbers  
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number 1: ");
                int num1 = input.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = input.nextInt();
                System.out.print("Enter number 3: ");
                int num3 = input.nextInt();
                System.out.print("Enter number 4: ");
                int num4 = input.nextInt();
                System.out.print("Enter number 5: ");
                int num5 = input.nextInt();
                
                // print and invoke the countEights method to get the result
                System.out.println("Result: " + countEights(num1, num2, num3, num4, num5)); 
         } //closing main method

        public static int countEights(int a, int b, int c, int d, int e){
                // initialize initial count at 0
                int count = 0;

                // turn each int parameter into string
                String aString = "" + a;
                String bString = "" + b;
                String cString = "" + c;
                String dString = "" + d;
                String eString = "" + e;

                // store converted string params into one string with 2 delimiters in between: their length and # sign
                String fString = "" + aString.length() + "#" + aString + bString.length() + "#" + bString + cString.length() + "#" + cString + dString.length() + "#" + dString + eString.length() + "#" + eString;

                // example:
                // if a = 88888, b = 888, c= -8, d = 8; f = -888888888
                // fString = 5#88888 3#888 2#-8 1#8 10#-888888888 (without spaces between)
                
                int i = 0;
                // i will start at position 0 of fString and i will run til the end of fString length using while loop
                // 5#88888 3#888 2#-8 1#8 10#-888888888
                // i
                
                while (i < fString.length()){
                        // Initialize j at position i then run a second while loop until j runs into # sign
                        int j = i;
                        while (fString.charAt(j) != '#'){
                                j++;
                        }
                        // after the second while loop ends, j should stop at the position of # sign
                        // 5#88888 3#888 2#-8 1#8 10#-888888888
                        // i
                        //  j

                        int lengthOfString = Integer.parseInt(fString.substring(i, j));
                        // extract the length of each parameter using substring method then turn it into an int using parseInt method
                        // lengthOfString = 5 (in this case)

                        String subString = fString.substring(j + 1, j + 1 + lengthOfString);
                        // extract the subString or param value by using substring method starting at position j+1 (2) and ending at position j + 1 + lengthOfString (7)
                        // subString = 88888

                        if (subString.equals("-8") || subString.equals("8")){
                                count++;
                        }
                        // check if subString matches -8 or 8, if yes count will be increased by one. Using equals method because of string comparison. 
                        // count = 0 (in this case)

                        i = j + 1 + lengthOfString;
                        // i is now will be moved to position of j + 1 + lengthOfString (7)
                        // 5#88888 3#888 2#-8 1#8 10#-888888888
                        //         i      
                        
                        // process will be repeated til i < fString.length() becomes false
                }
                return count;
        }
} //closing class header