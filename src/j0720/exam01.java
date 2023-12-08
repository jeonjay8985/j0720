package j0720;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num=s1.nextInt();
		if(num%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
			
			
			System.out.print("정수 입력 : ");
			num=s1.nextInt();
			if(num%2==0) {
				System.out.println("짝수입니다");
			}else {
				System.out.println("홀수입니다");
				
				
				System.out.print("정수 입력 : ");
				num=s1.nextInt();
				if(num%2==0) {
					System.out.println("짝수입니다");
				}else {
					System.out.println("홀수입니다");
					
		   }
		 

     	}

      }

	}
	
}