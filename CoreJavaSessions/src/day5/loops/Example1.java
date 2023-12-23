package day5.loops;

public class Example1 {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);	
			
		//when we number number iteration dn its always recommended to use for loop
		/*
		 * Initialization:	int i=0
		   step1: condition
		   step2: execute body
		   step3: incre/decre				
		   repeat step1 to 3 till the condition gets failed
		 */
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("****************");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("***********EVEN***********");
		for(int i=21; i<=65; i++)
		{
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("**********************");
		for(char c1='a';c1<='z';c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n**********************");
		for(char c1='z';c1>='a';c1--) {
			System.out.print(c1+" ");
		}
		System.out.println("\n**********************");
		for(char c1='A';c1<='Z';c1++) {
			System.out.print(c1+" ");
		}
	}
}
