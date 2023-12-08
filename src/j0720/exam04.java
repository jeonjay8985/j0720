package j0720;

import java.util.Scanner;

public class exam04 {
	
	public static void Add(int n1, int n2) {             //void는 리턴값이 없는 경우, 만약 int가 된다면~ 
		int result=n1+n2;
		System.out.printf("%d+%d=%d\n", n1, n2, result); //~리턴값이 필요함 *return result;이 들어감 (result=n1+n2)
	}
	public static void Sub(int n1, int n2) {
		int result=n1-n2;
		System.out.printf("%d-%d=%d\n", n1, n2, result);
	}
	public static void Mul(int n1, int n2) {
		int result=n1*n2;
		System.out.printf("%d*%d=%d\n", n1, n2, result);
	}
	public static void Div(int n1, int n2) {
		int result=n1/n2;
		System.out.printf("%d/%d=%d\n", n1, n2, result);
	}
	public static void Mov(int n1, int n2) {
		int result=n1%n2;
		System.out.printf("%d%%%d=%d\n", n1, n2, result); //나머지 퍼센트표시 2개! %%
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int num1, num2;          //변수 2개 받음          //~리턴 필요할 경우 *, result;추가
		
		System.out.print("정수1 입력 : ");
		num1=s1.nextInt();

		System.out.print("정수2 입력 : ");
		num2=s1.nextInt();
		
	Add(num1, num2);                                   //~result=Add(num1, num2);
	                                                   //~System.out.printf("%d+%d=%d\n", num1, num2, result);
	Sub(num1, num2);		
	Mul(num1, num2);
	Div(num1, num2);
	Mov(num1, num2);
	
	
	}

}

	
