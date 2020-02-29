package src;
import java.util.Vector;

public class problem_3 {

	/*
	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?

	ANSWER UNKNOWN (compilation time exceeds 5 minutes in php)
	*/
	public static void main(String[] args)
	{
//		  long END_NUMBER = 13195;
		  long END_NUMBER = 600851475143L;
		  Vector factors_of_numbers = new Vector();
		  Vector prime_numbers = new Vector();
		  
		  //Finding all factors of Number Goal
		  for(long i = 2l; i < (END_NUMBER/2);i++)
		  {
			  if ((END_NUMBER % i) == 0)
			  {
				  factors_of_numbers.add(i);
				  System.out.println("Running" + i);
			  }
		  } //for i
		  System.out.println("success");
		  //Determining primes from list of factors
		  Vector temp_copy_factors_of_numbers = factors_of_numbers;
//		  for(int i = 0; i < factors_of_numbers.size(); i++)
//		  {
//			  
//			  for(int j = factors_of_numbers.size(); j > 0; j--)
//			  {
//				  
//				  if ( factors_of_numbers.elementAt(i) % factors_of_numbers.elementAt(j-1) == 0
//						  && (factors_of_numbers.elementAt(i) != factors_of_numbers.elementAt(j-1))
//				     )
//				  {
////					  System.out.println( factors_of_numbers.elementAt(i)+ " != " + factors_of_numbers.elementAt(j-1)  );
////					  System.out.println(temp_copy_factors_of_numbers.elementAt(i));
//					  temp_copy_factors_of_numbers.set(i,-1);
//				  }
//				  
//			  }
//		  }

		//  temp_copy_factors_of_numbers.remove(1); // this works fine .
		//	System.out.println(temp_copy_factors_of_numbers.elementAt(1));
		System.out.println("The Vector is: " + temp_copy_factors_of_numbers );
	}
	
	
}