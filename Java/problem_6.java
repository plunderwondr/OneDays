//The sum of the squares of the first ten natural numbers is,
//
//12+22+...+102=385
//The square of the sum of the first ten natural numbers is,
//
//(1+2+...+10)2=552=3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
// COMPLETE
public class problem_6 {
	public static void main(String[] args)
	{
		int LARGEST_VALUE = 100;
		int sumOfSquaredValues = 0;
		int valuesSumSquared = 0;
		int differenceOfValues = 0;
		for(int i = 1; i<=LARGEST_VALUE;i++)
		{
			valuesSumSquared +=i;
			sumOfSquaredValues += (int)Math.pow(i, 2);
		}
		
		valuesSumSquared = (int)Math.pow(valuesSumSquared, 2);
		differenceOfValues = valuesSumSquared - sumOfSquaredValues;
		
		System.out.print(differenceOfValues);
		
	}
}