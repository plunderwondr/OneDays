package leetCodeWork;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuntimeTest {

    public static void main(String[] args) {

    	
    	//System.out.println();
    	
    	System.out.println(isValid("{(}")); 
    	
    }

    public static boolean isValid(String s) {
        
    	List<Character> openBrackets = new ArrayList<>();
        
        for( int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
	            case '(':
	                openBrackets.add('(');
	            break;
                case '{':
                    openBrackets.add('{');
                break;
                case '[':
                    openBrackets.add('[');
                break;
                case ')':
                    if(openBrackets.size() == 0 || openBrackets.get(openBrackets.size()-1) != '(' )
                    {
                    	return false;
                    }
                    openBrackets.remove(openBrackets.size()-1);
                break;
                case '}':
                    if(openBrackets.size() == 0 || openBrackets.get(openBrackets.size()-1) != '{' )
                    {
                    	return false;
                    }
                    openBrackets.remove(openBrackets.size()-1);
                break;
                case ']':
                    if(openBrackets.size() == 0 || openBrackets.get(openBrackets.size()-1) != '[' )
                    {
                    	return false;
                    }
                    openBrackets.remove(openBrackets.size()-1);
                break;
            }
        } //for i     
                
        boolean result = openBrackets.size() == 0 ?  true :  false;

        return result;
    }

}
    

    
