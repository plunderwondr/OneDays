import java.util.Vector;

public class problem_3 {

	/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?

	ANSWER UNKNOWN (compilation time exceeds 5 minutes in php)
	*/
	public static void main(String[] args)
	{
		  long END_NUMBER = 13195;
//		  long END_NUMBER = 600851475143L;
		  Vector<Integer> factors_of_numbers = new Vector<Integer>();
		  Vector<Integer> prime_numbers = new Vector<Integer>();
		  
		  //Finding all factors of Number Goal
		  for(int i = 2; i < (END_NUMBER/2);i++)
		  {
			  if ((END_NUMBER % i) == 0)
			  {
				  factors_of_numbers.add(i);
			  }
		  } //for i
		  
		  //Determining primes from list of factors
		  Vector<Integer> temp_copy_factors_of_numbers = factors_of_numbers;
		  for(int i = 0; i < factors_of_numbers.size(); i++)
		  {
			  
			  for(int j = factors_of_numbers.size(); j > 0; j--)
			  {
				  
				  if ( factors_of_numbers.elementAt(i) % factors_of_numbers.elementAt(j-1) == 0
						  && (factors_of_numbers.elementAt(i) != factors_of_numbers.elementAt(j-1))
				     )
				  {
//					  System.out.println( factors_of_numbers.elementAt(i)+ " != " + factors_of_numbers.elementAt(j-1)  );
//					  System.out.println(temp_copy_factors_of_numbers.elementAt(i));
					  temp_copy_factors_of_numbers.set(i,-1);
				  }
				  
			  }
		  }

		//  temp_copy_factors_of_numbers.remove(1); // this works fine .
		//	System.out.println(temp_copy_factors_of_numbers.elementAt(1));
		System.out.println("The Vector is: " + temp_copy_factors_of_numbers );
	}
	
	
}