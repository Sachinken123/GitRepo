package day18.predefinedclasses.scannerclass;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
//		System.out.println(addNumber('+', 10, 20));
//		System.out.println(addNumber('-', 25, 20));
		
		Scanner scn=new Scanner(System.in);
		int num1,num2;
		char op;
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();
		System.out.println("Provide operator: ");
		op=scn.next().charAt(0);
		System.out.println(addNumber(op, num1,num2));
	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		}else if (op == '-') {
			return num1 - num2;
		} else {
			return 0;
		}
	}
}
