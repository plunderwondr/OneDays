package src;
// Swamp two variables values without using a tertiary variable.

public class swap_variables{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		//using arithmetic
//		System.out.println(a);
//		System.out.println(b);
//		b = a + b;
//		System.out.println(b);
//		a= b - a;
//		System.out.println(a);
//		b = b - a;
//		System.out.println(b);
		
		//harder to read condensed
//		a+=b;
//		a=b-a;
//		b-=a;
//		
		//condensed bitwise
		b^=a;
		a^=b;

		
		System.out.println(a);
		System.out.println(b);
		
	}
}
	