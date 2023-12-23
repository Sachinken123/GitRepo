//Q.4}Display uppercased alphabets using for loop ?
//Q.5}Display lowercased alphabets using for loop ?
package Forloop;

public class UppercaseAlpha {

	public static void main(String[] args) {
		System.out.println("These are Uppercased Alpabets :");
		for (char i = 'A'; i <= 'Z'; i++)
		{	
			System.out.print(" "+i);
			
		}
		System.out.println("\nThese are Lowercased Alphabets :");
		for (char i = 'a'; i <= 'z'; i++)
		{
			System.out.print(" "+i);
			
		}
	}

}
