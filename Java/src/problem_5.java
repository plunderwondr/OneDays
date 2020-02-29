
package src;
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */


public class problem_5 {
	public static void main(String[] args)
	{
	
		int ALL_DIVISIBLES = 20;
		
		int resultNumber = 0;


		for( int i = 0; resultNumber == 0; i++)
		{
			for( int j = 1; j <= ALL_DIVISIBLES; j++ )
			{
				if(i % j != 0)
				{
					break;
				}
				else if(j == ALL_DIVISIBLES && i % j == 0 )
				{
					resultNumber = i;
				}

			}
		}
		  System.out.println(resultNumber);

	}

	
}