package leetCodeWork;

import java.io.Console;
import java.util.Arrays;

public class RuntimeTest {

    public static void main(String[] args) {

    	int nums1[] = {1,3,4};
    	int nums2[] = {2,5,6};
    	
    	System.out.println(Arrays.toString(nums1));
    	System.out.println(Arrays.toString(nums2));
    	

    	findMedianSortedArrays(nums1,nums2);
    	
    	System.out.println(findMedianSortedArrays(nums1,nums2));
    	
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int totalSize = nums1.length + nums2.length;
        int[] mergedArrays = new int[totalSize];
        
        float medianMergedArrays = 0;
        
        int mergedArray[] = new int [nums1.length + nums2.length];
        
        for( int i = 0; i < nums1.length;i++)
        {
            mergedArray[i] = nums1 [i];
        }
        for( int i = 0; i < nums2.length;i++)
        {
            mergedArray[nums1.length + i] = nums2 [i];
        }  
        
        Arrays.sort(mergedArray);

        
        if ( mergedArray.length % 2 == 0)
        {
        	 medianMergedArrays = (float)(mergedArray[ (mergedArray.length / 2)] + mergedArray[ (mergedArray.length / 2) - 1]) / 2;
        }
        else
        {
           medianMergedArrays = mergedArray[ (mergedArray.length / 2)];
           System.out.println((mergedArray.length / 2));
        }
        
        System.out.println(Arrays.toString(mergedArray));
        return medianMergedArrays;
    } // findMedianSortedArrays(int[] nums1, int[] nums2)
    
    
    
    
    
    
    
}