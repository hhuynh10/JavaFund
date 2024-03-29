//import API's needed here:

public class FiveMinDrill 
{  
        public static void main(String args[ ]) 
        {
                countEights(-8, 18, -88888, 8, 488); 
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