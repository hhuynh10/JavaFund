//import API's needed here:

import java.util.Arrays;

public class Problem 
{  

        public static void main(String args[ ]) 
        {
                int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

                for (int i = 0; i < 100; i++){
                        int randomInt = (int)(Math.random() * 10);
                        counts[randomInt]++;
                }

                for (int i = 0; i < counts.length; i++){
                        System.out.println(i + ": " + counts[i]);
                }

         } //closing main method
} //closing class header