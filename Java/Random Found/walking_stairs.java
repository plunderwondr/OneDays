/*
Question 1:
 Write function numOfWays(n) Where n is number of steps. 
User may either take 1 or 2 steps to reach the top.
Determine how many ways you can reach the top given stair size n.
Question 2:
 Write function numOfWays(n,[x]) 
 n is same. [x] = an array of allowed step sizes.
 Determine number of possible ways to ascend  stairs given n,[x] 
 ex. [x] = {1,3,5,6}

*/

/*
Q1:
First Idea:
    V2 - loop through all combinations count if mod 0
Proven math:
    (N) = (n-1) + (n-2)     N is equal to the result of n -1 and result of n-2 therefore recursive solution
*/

/*
Q2:
    Assuming this question is a more complicated version of a recursive n-1,n-2 . skipping to attempting to prove on whiteboard.
*/



public class walking_stairs {
	
	static int numOfWays(int n) {
		
//		int result= ;
		
		if (n == 1 || n == 0)
		{
			return  1;
		}
		return numOfWays(n-1) + numOfWays(n-2);
	}
	

	static int numOfWays(int n, int [] stepOptions)
	{
		if( n == 0)
		{
			return 1 ;
		}
		int total = 0;
		
		for(int i = 0; i<stepOptions.length;i++) 
		{
			if(n - i >= 0)
			{
				int stepiValue = stepOptions[i];
				total += numOfWays(n - stepiValue,stepOptions);
			}
		}
		
		
		return total;
		
	}
	
	
	public static void main(String[] args)
	{
		int stairCount = 5;
		int [] array = {1,2,3,4};
		int output = numOfWays(stairCount,array);
		
		System.out.println("Welcome");
		System.out.println(output);
	}
	
	
}