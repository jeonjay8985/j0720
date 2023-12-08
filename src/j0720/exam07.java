package j0720;

public class exam07 {
	public static String greeting() {      //2.넘어가
		return "Hi!";                      //3.리턴값 Hi
	}

	public static int div() {
		int a=10, b=5;
		int result=a/b;                
		return result;                     //int result+return 없이 =>*return a/b;써도 됨 (10/5가 넘어감)
	}
	
	
	
	public static void main(String[] args) {
		String str=greeting();             //1.그리팅 호출
		System.out.println(str+"JAVA");    //4. str=Hi + JAVA

		int num=div();
		System.out.println(num);
		
	}

}
