import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class zeroesToCenter {

    /*
     * Complete the 'zeroesToCenter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * All 0's should be placed in center of array assuming floor(arr.length/2)
     */

    public static List<Integer> zeroesToCenter(List<Integer> arr) {
        // First problem: input is a List not an array, do I  assume return of array or arrayList.
     
     List<Integer> nonZeroArray = new ArrayList<Integer>();
     List<Integer> resultArray= new ArrayList<Integer>();
     for(int i = 0; i < arr.size(); i++)
     {
         if(arr.get(i) != 0)
         {
             nonZeroArray.add(arr.get(i));
         }
        
     }
     
     
       int  numberOfZeroes = arr.size() -(nonZeroArray.size());
       int centerOfNonZero = (int) Math.floor(nonZeroArray.size()/2);
      // left half of non zeros
	    for(int i = 0; i < centerOfNonZero; i++)
	    {
	        resultArray.add(nonZeroArray.get(i));
	    }
	    //add zeros
	    for(int i = 0; i <numberOfZeroes; i++)
	    {
	        resultArray.add(0);
	    }
	    
	    //right half of non zeros
	    for(int i = (centerOfNonZero+numberOfZeroes ); i < arr.size() ; i++)
	    {
	        resultArray.add(nonZeroArray.get(i-numberOfZeroes));
	        
	    }
	
	    return resultArray;
    }




	public static void main(String[] args)
	{
		
		 List<Integer> valueArray = Arrays.asList(1,0,4,3,0,8,1,0,4); 
		
		System.out.println(zeroesToCenter(valueArray));
		
		
	}
}
