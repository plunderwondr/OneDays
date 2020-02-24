/*
	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	
	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.
	
	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
	COMPLETE
*/
public class problem_9 
{
	public static void main(String[] args)
	{
int a;
int b;
int c;
int RESULT = 1000;
int resultantProduct = 0;
		for(int i=1;i<RESULT;i++)
		{
			for(int j=i;j<RESULT;j++)
			{
				for(int k=j;k<RESULT;k++)
				{
					if(Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && (i + j + k) == RESULT)
					{
						resultantProduct = i * j * k;
						System.out.print(resultantProduct);
					}
				}//for k
			}//for j
		
		} //for i
	}//main
}//class problem_9