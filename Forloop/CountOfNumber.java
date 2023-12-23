//Q.6}Count number of digits in an integer using for loop ?
package Forloop;

public class CountOfNumber {

	public static void main(String[] args) {
		int count = 0 ;
		for (int i = 1234567; i != 0; i /= 10) {
			count++ ;
			
		}
		System.out.println(count);

	}

}
