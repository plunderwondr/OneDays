package leetCodeWork;

import java.io.Console;
import java.util.Arrays;

public class RuntimeTest {

    public static void main(String[] args) {

    	
    	System.out.println(romanToInt("MCVII"));
    	
    }

    public static int romanToInt(String s) {
        int result = 0;

        // if smaller number comes before bigger number subtract instead of add
        // instead of programming logic could also hard code the additional 6 symbols, doubling the fixed reference size
        s.toUpperCase(); // make sure all will be detected, may introduce non anglo letter issues
		 //traverse string array 
 
		 for(int i = 0;i<s.length();i++)
		 {
		//check in pairs increment by two if alt value
			switch(s.charAt(i))
			{
				case 'I':
					if(s.length() > i+1) {
						switch(s.charAt(i+1))
						{
						case 'V':
							result += 4 ;
							i++; //we used both numbers so we must increment past it 
							break;
						case 'X':
							result += 9 ;
							i++; //we used both numbers so we must increment past it 
							break;
						default:
							result += 1 ;
							break;
						}
						break; // break from I 
					}
					else
					{
						result += 1 ;
						break;
					}
				case 'V':
					result+= 5;
					break;
				case 'X':
					if(s.length() > i+1) {
						switch(s.charAt(i+1))
						{
						case 'L':
							result += 40 ;
							i++; //we used both numbers so we must increment past it 
							break;
						case 'C':
							result += 90 ;
							i++; //we used both numbers so we must increment past it 
							break;
						default:
							result += 10 ;
							break;
						}
						break; // break from X
					}
					else
					{
						result += 10 ;
						break;
					}
				case 'C':
					if(s.length() > i+1) {
						switch(s.charAt(i+1))
						{
						case 'D':
							result += 400 ;
							i++; //we used both numbers so we must increment past it 
							break;
						case 'M':
							result += 900 ;
							i++; //we used both numbers so we must increment past it 
							break;
						default:
							result += 100 ;
							break;
						}
						break;
					}
					else
					{
						result += 100 ;
						break;
					}
				case 'D':
					result+= 500;
					break;
				case 'M':
					result+= 1000;
					break;
				default: result = -1;
			}//switch(s.charAt(i))
		 } //for i
		 return result;
    }

}
    

    
