import java.util.Arrays;

//merge sort


//RE: recursive function to separate array until 1 element
// function combines 2 arrays into 1 
public class merge_sort{
	
	static int [] numbersToSort = new int [] {80, 50, 30, 10, 90, 60, 0, 70, 40, 20};
	static int [] tempTransfer = new int[numbersToSort.length];
	public static void main(String[] args)
	{

	    System.out.println("array before sorting");
	    System.out.println(Arrays.toString(numbersToSort));
	    
	    //start end required for recursion
	    mergeSort(0,numbersToSort.length-1);
	    
	    System.out.println("array after sorting");
	    System.out.println(Arrays.toString(numbersToSort));
	}//void main()
	
	
	private static void mergeSort( int leftBound,int rightBound )
	{

		// stops recurring when there is only 1 item left in the array
		if (leftBound < rightBound)
		{
			//Being Splitting Array in two (left side right side)
			int middle = leftBound + (rightBound - leftBound)/ 2;
			mergeSort(leftBound, middle);
			//Right side of Array
			mergeSort(middle+1,rightBound);
			merge(leftBound,middle,rightBound);
		}
		
		
	} //mergesort()
	
	private static void merge(int leftBound, int middle, int rightBound) 
	{
		//put into result array for temporary holding
		for(int i = leftBound; i<= rightBound; i++)
		{
			tempTransfer[i] = numbersToSort[i] ;
		}
		int i = leftBound;
		int j = middle +1;
		int k = leftBound;
		
		//compare left and right , insert smaller value 
			while(i <= middle && j <= rightBound)
			{
				if(tempTransfer[i] <= tempTransfer[j])
				{
					numbersToSort[k] = tempTransfer[i];
					i++;
				}
				else
				{
					numbersToSort[k]= tempTransfer[j];
					j++;
				}
				k++;
			} //while (i <= middle && j <= rightBound)
		
			// leftovers
			while (i <= middle) 
			{
				numbersToSort[k] = tempTransfer[i];
				k++;
				i++;
			}
				
		} //merge(int leftBound, int middle, int rightBound) 	
}// class merge_sort