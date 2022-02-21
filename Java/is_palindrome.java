package leetCodeWork;

import java.io.Console;
import java.util.Arrays;

public class RuntimeTest {

    public static void main(String[] args) {

    	

    	System.out.println(isPalindrome(113411));
    	
    }

    	public static boolean isPalindrome(int x) {
    		// doable as string and maybe with modulus math? 
    		// Starting with String Method
    		//Convert to string parse as array.
    		
    		String s = Integer.toString(x);
    		int lengthOfS = s.length();
    		
    		// Don't need a switch as long as we drop the remainder
    		for(int i = 0; i < (lengthOfS/2); i++)
    		{
    			if ( s.charAt(i) != s.charAt(lengthOfS - (i +1)))
    			{
    				return false;
    			}
    		}
    		
    		return true;
    	}
     
    

    
}