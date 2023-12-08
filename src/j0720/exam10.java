package j0720;

import java.util.Scanner;

public class exam10 {
	 public static void sum(int st, int end) {  //n1, n2로 넣어도 상관없음. main메소드랑 다른것!!
	    	int sum=0;
	    	for(int i=1; i<=100; i++) {
	    		sum += i;
	    	}
	    	System.out.printf("%d부터 %d까지의 합 : %d\n", st, end, sum);
	
	 }
	

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("시작값 입력 : ");
		int start=s1.nextInt();
		System.out.print("종료값 입력 : ");
		int end=s1.nextInt();
		sum(start, end);

	}

}
