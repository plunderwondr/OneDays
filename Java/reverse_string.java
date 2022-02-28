package leetCodeWork;

import java.io.Console;
import java.util.Arrays;

public class RuntimeTest {

    public static void main(String[] args) {

    	

    	System.out.println(strStr("needle","l"));
    	
    }

    public void reverseString(char[] s) {
        
        
        
        char temp;
        
        for(int i = 0; i < (s.length/2); i++)
        {
            // uneven array center object stays in middle so only need half run
        temp = s[i];
        s[i] = s[s.length - i - 1];
        s[s.length - i - 1 ] = temp;
        
        }
        //Temp swap is O(n^2) (?)
        
        
    }
    

    
}