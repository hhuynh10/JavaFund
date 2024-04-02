import java.util.Scanner;

public class ExampleArraysIntro
{  

public static void main(String args[ ]) 
        {
				Scanner keyboard = new Scanner(System.in);

				final int MAX_SIZE = 4;
				
				int [ ] x;
				x=new int[4];	
			
				char [ ] y;
				y=new char[MAX_SIZE];
				
				boolean [ ] z = {true, false, false, false};
				
				int [ ] userSized;
				int size;
							
		 
			 	//display address location of array
			 	System.out.println("Stored in x is an address: " + x);        
			 	System.out.println("Stored in y is an address: " + y);
			  	System.out.println("Stored in z is an address: " + z);
							
				//determine size of userSized array
				System.out.println("How many values do you need to store?");
				size = keyboard.nextInt();
				userSized = new int[size];
				//once the size of the array is determined an address is assigned
				System.out.println("Stored in userSized is an address: " + userSized);

				
				//In Java, if array is not instantiated with values, they are set to zero (0).
				for(int i = 0; i<size;i++)//note: scope of i is local to for loop
				{
					System.out.println("Stored in userSized[" + i+ "]: " +userSized[i]);
				}
				
				//fill userSized array from keyboard input
				for(int i = 0; i<size;i++)//note: scope of i is local to for loop
				{
					System.out.println("Enter an integer to store in userSized[" + i+ "]: ");
					userSized[i]= keyboard.nextInt();
				}


				
				

//enhanced for loop for reading arrays - in order					
				for(boolean index : z) //index starts at zero (0), and runs until z.length -1 (the indices of z)
				{
							System.out.println("Stored in z: " + index);
				}
				
//more useful choice for working with arrays				
				for(int i=(MAX_SIZE-1);i>=0;i--)//note: scope of i is local to for loop & this loop prints in reverse order

				{
					System.out.println("Stored in z[" + i+ "]: " +z[i]);
				}
				
				for(int i = 0; i<size;i++)//note: scope of i is local to for loop & now you will see the stored values from keyboard input
					{
					System.out.println("Stored in userSized[" + i+ "]: " +userSized[i]);
				}
	  
				  
         } //closing main method
} //closing class header