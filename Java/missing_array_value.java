//Program that returns the missing value
//found solution required two parameters, redesigned from scratch to support any number of missing numbers
//Equation is unfortunately f(x)= 2n 



import java.util.ArrayList;
import java.util.Arrays;

public class missing_array_value{
	public static void main(String[] args)
	{
		int [] sampleArray = { 1, 2, 3 ,5 ,6,7,9,11,13};

		System.out.println(Arrays.toString(printMissingNumber(sampleArray)));
		
	}
	
	public static int[] printMissingNumber(int [] array)
	{
		ArrayList <Integer> missingVector = new ArrayList<Integer>(0);
		
		int offset = 1 ;
		
		for( int i  = 0; i < array.length; i++)
		{
			if (array[i] != (i+offset))
			{
				missingVector.add(i+offset);
				offset++;
			}
			
		}
		int  missingNumbers[] = new int[missingVector.size()];
		for(int i = 0; i<missingVector.size();i++)
		{
			missingNumbers[i] = missingVector.get(i);
		}
		
		return missingNumbers;
	}
}