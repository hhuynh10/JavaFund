import java.util.Scanner;
import java.io.*;

public class Lab02UsefulArrayAlgorithms
{  

public static void main(String args[ ])  throws IOException

        {
		  		final int MAX_SIZE = 5;
		  		int [ ]a = {-1,1,3,5,7};
				int [ ]b = new int[MAX_SIZE];
				int [ ]c = new int[MAX_SIZE];
				
				int x=MAX_SIZE -1;
				//fill array b with the values in array a in reverse order
				for(int i = 0 ; i < MAX_SIZE; i++) //this i is local to this loop
				{
				
				
					b[i] = a[x];

					System.out.println("a["+x+"]=  " + a[x] +"  b["+i+"]=  "  +b[i]);
						x--;

				}
				//fill array c with odd ints starting at -1
				int fillVal=-1;			
				for(int i = 0 ; i < MAX_SIZE; i++) //again, i is local to this loop only
				{
					c[i] = fillVal;
					fillVal+=2;
					System.out.println("c["+i+"]=  " + c[i]);
										
				}
				
/*-----------------------------------------
compare 2 arrays: a and b, then a and c
x==y //error won't work
loop & compare each element x[?] == y[?]
display array names & true if arrays are identical in order, 
otherwise display array names and false
Insert code below:........................*/


/*-----------------------------------------
sum array values: a, then b, then c
declare a sum variable for each of the arrays
of the same data type as array
and accumulate the values in the array
display the individual sum of each of the arrays: a, b, and c
and a total sum of all 3 arrays
Insert code below:........................*/


/*-----------------------------------------
find the average value of an array
use the sums from the above code, to determine
the EXACT average of array a, 
and the average of all three arrays were they to be combined
Insert code below:........................*/


/*-----------------------------------------
finding the min value in array a and array b
set min to first element in array 
then compare all others in a loop, assigning min a new value if a lower value is found
display min value upon completion of the loop
Insert code below:........................*/


/*-----------------------------------------
finding the max value in array a and array b
set max to first element in array 
then compare all others in a loop, assigning max a new value if a higher value is found
display max value upon completion of the loop
Insert code below:........................*/
	  
/*-----------------------------------------
sequential search
copy and modify the code you wrote to compare two arrays
to determine if a value 'match' is within an array
display index of 1st instance of matched value 
else display -1
Use array d and match as listed below.
Insert code below:........................*/
int []d = {2,18,4,4,6,8,10};
int match =4;

/*-----------------------------------------
sequential search
copy and reuse the code you wrote to compare two arrays
(above) to determine if the value 'match' is within an array
display index of 1st instance of matched value 
else display -1
Use array d again, and match as listed below.
Insert code below:........................*/
match= 12;

/*-----------------------------------------
sort array from max value to min value (use array d)
loop through all elements comparing 2 at a time, & swap elements if [n] < [n+1]
with each entrance to inner loop decrement iterations by 1
repeat (outer loop) n element times
swapping:
temp = one;
one = two; //one contains two
two = temp; //two now contains one
display array after it has been sorted
Insert code below:........................*/

         } //closing main method

} //closing class header