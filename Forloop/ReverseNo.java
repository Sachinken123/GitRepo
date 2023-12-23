//Reverse a number using a for loop ?
package Forloop;

public class ReverseNo {

	public static void main(String[] args) {
		for (int i = 1234; i != 0; i /= 10) {
		 int rem = i%10 ;
		 System.out.print(rem);
			
		}
		
	}
}

