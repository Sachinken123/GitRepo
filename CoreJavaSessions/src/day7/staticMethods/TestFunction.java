package day7.staticMethods;

public class TestFunction {
	public static void main(String[] args) {
		
		additionOfTwoNumber();
		System.out.println("***********************");
		TestFunction.additionOfTwoNumber();		
		System.out.println("============================");
		addtionOfNumbers(10, 20,25);
		System.out.println("***********************");
		addtionOfNumbers(25, 70,58);
		//System.out.println(addtionOfNumbers(10, 85, 95));//void won;t return any value hence we can't write inside println()
		System.out.println("=============================");
		printReverseNumber(123);
		System.out.println("=============================");
		//method body will be executed but you will not be able to print or use its return value
		//getReverseNumber(450);
		
		//method body will be executed, you will be able to print its return value as well
		//System.out.println("Reverse number is: "+getReverseNumber(451));
		
		//method body will be executed, you will be able to use its return value in future
		int reverseNum=getReverseNumber(451);
		System.out.println("Reverse number is: "+reverseNum);
		int num=reverseNum*100;
	}
	
	static int getReverseNumber(int num) {
		System.out.println("Actual number is: "+num);
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;		
	}
	
	static void printReverseNumber(int num) {
		System.out.println("Actual number is: "+num);
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is: "+rev);		
	}
	
	
	static void addtionOfNumbers(int num1, int num2, int num3) //Local variable: int num1=10; int num2=20;
	{
		int res=num1+num2+num3;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Number3 is: "+num3);
		System.out.println("Result is: "+res);
	}
	
	static void additionOfTwoNumber() {
		int num1=10,num2=20,res;
		res=num1+num2;
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		System.out.println("Result is: "+res);
	}
}
