//import API's needed here:

public class Problem 
{  
        public static void main(String args[ ]) 
        {
            
			
			
         } //closing main method

        public static void reverse(int number){
            String numString = "" + number;
            String newString = "";
            for (int i = numString.length()-1; i >= 0; i--){
                newString += "" + numString.charAt(i);
            }
            System.out.println(newString);
        }
} //closing class header