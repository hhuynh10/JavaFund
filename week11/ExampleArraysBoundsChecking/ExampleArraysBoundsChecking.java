import java.util.Scanner;

public class ExampleArraysBoundsChecking
{  

     
public static void main(String args[ ]) 
        {
          	int [ ] x = { 2,4,6,8};
				
				for(int i=0; i<4; i++)
					System.out.print(x[i] + "  ");
				
				System.out.print(x[-1]); //error: comment out this statement and the next statement will also produce a run-time error
				System.out.print(x[4]); //run-time error
				  
         } //closing main method
} //closing class header