/*--------------------------------------------------------------------------
Rubber Duck Debug This Code
There are 10 errors in this code. 
Types of errors to be repaired:
Syntax, run-time, and logic.
When running properly, it will take each of the binary value "data" strings
and convert them to the appropriate unsigned integer values.
----------------------------------------------------------------------------*/

public class Problem
{  

     
public static void main(String args[ ])         
{
		  		
				int i=0;
				int x=1;
				
				
				String data[] ={"00000001","10000000","11001100","10101010","01010101","00001111","11110000"};			
				
				do
				{
									
							if(data[i].charAt(0)=='1')
								x=x+128;
								
							if(data[i].charAt(1)=='1')
								x += 64;
								
							if(data[i].charAt(2)=='1')
								x += 32;
								
							if(data[i].charAt(3)=='1')
								x += 16;

							if(data[i].charAt(4)=='1')
								x += 8;

							if(data[i].charAt(5)=='1')
								x += 4;
								
							if(data[i].charAt(6)=='1')
								x -= 2;

							if(data[i].charAt(7)=='1')
								x += 1;
							
							System.out.println(data[i]);
							i++;									
				}while(i<7); //end of do/while				
		}//closing main method				 
  }//closing class header

