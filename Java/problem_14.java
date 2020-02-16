//
//The following iterative sequence is defined for the set of positive integers:
//
//n → n/2 (n is even)
//n → 3n + 1 (n is odd)
//
//Using the rule above and starting with 13, we generate the following sequence:
//
//13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//Which starting number, under one million, produces the longest chain?
//
//NOTE: Once the chain starts the terms are allowed to go above one million.
// Wrong result

public class problem_14 {
	public static void main(String[] args)
	{
		
		int currentValue = 0;
		int count = 0;
		int greatestCount = 0;
		int greatestNumber = 0;
		int MAXIMUM_BOUND = 999999;
		for(int i = 1; i <= MAXIMUM_BOUND; i++ )
		{
			count = 1;
			currentValue = i;
			while(currentValue!= 1) {
				if ((currentValue % 2) == 0)
				{
					currentValue = currentValue/ 2;
				}
				else {
					currentValue = (currentValue * 3 )+1;
				}
				count++;
			};
		
			if(count > greatestCount) {
				greatestCount = count;
				greatestNumber = i;
			}
		}//for i
		System.out.println(greatestCount);
		System.out.println(greatestNumber);
	}
}