package j0720;

import java.util.Scanner;

public class exam08 {

	public static int Max(int n1, int n2) {
		int result;
		if(n1>n2) {
			result=n1;
		}else {
			result=n2;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int num1=s1.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2=s1.nextInt();
				
		int max1=Max(num1, num2);
		System.out.printf("%d와 %d 두 수 중 큰 수는 %d 입니다.",num1, num2, max1);
		
		
		
		
	}

}
