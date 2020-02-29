package src;

import java.util.Arrays;

public class bubble_sort{
	public static void main(String[] args)
	{
	
		int [] numbersToSort = new int[] {10,-2,0,14,43,25,18,1,5,45,14};
		int noSwap = 0;
		System.out.println(Arrays.toString(numbersToSort));
		do {
			noSwap = 0;
			for(int i = 0; i<(numbersToSort.length - 1); i++)
			{
					if(numbersToSort[i] >numbersToSort[i+1]) {
						//Swaps the two array values without using a temporary value. For clean readable code this should use temporary value.
						numbersToSort[i] ^= numbersToSort[i+1];
						numbersToSort[i+1] ^= numbersToSort[i];
						numbersToSort[i] ^= numbersToSort[i+1];
					}
					else 
					{
						noSwap++;
					}
			}
		}while(noSwap !=(numbersToSort.length - 1));

		System.out.println(Arrays.toString(numbersToSort));
		
	}
}