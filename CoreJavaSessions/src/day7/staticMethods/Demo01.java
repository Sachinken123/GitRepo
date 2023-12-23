package day7.staticMethods;

public class Demo01 {
	void addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		return;
	}
	void addTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}
	public static void main(String[] args) {
		Demo01 d1=new Demo01();
		d1.addTwoNumber();
		//System.out.println(d1.addTwoNumber());
		d1.addingTwoNumber(25, 35);
		int x=10,y=20;
		d1.addingTwoNumber(x,y);
	}


}
