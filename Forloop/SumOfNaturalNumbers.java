//Q.3}Display sum of n Natural numbers ?
package Forloop;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n = 10 ;
		int sum = 0 ;
		for (int i = 1; i <= n; i++) {
			sum += i; // Compound assignment operator
			// OR sum = sum + i ;
		}
		System.out.println("Sum of first "+n+ " \nnatural numbers is :"+sum);

	}

}
