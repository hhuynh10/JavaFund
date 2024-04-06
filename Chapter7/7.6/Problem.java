//import API's needed here:

import java.util.Arrays;

public class Problem 
{  

        public static void main(String args[ ]) 
        {
                int[] primeList = new int[50];
                int count = 0;
                
                int i = 2;
                while (count < primeList.length){
                        if (isPrime(i)){
                                primeList[count] = i;
                                count++;
                        }
                        i++;
                }

                for (int j = 0; j < primeList.length; j++){
                        if ((j+1) % 10 != 0){
                                System.out.printf("%-4d", primeList[j]);
                        } else {
                                System.out.printf("%-4d\n", primeList[j]);
                        }
                }
         } //closing main method

        public static boolean isPrime(int n){
                if (n <= 1){
                        return false;
                }

                for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                                return false;
                                }
                        }
                        return true;
        }
} //closing class header
