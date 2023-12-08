package j0720;

public class exam05 {
	public static void Method() {
		System.out.println("빈 매서드");
	}
    public static void Method(int n1) {
    	System.out.println("정수 매서드 : "+(n1*n1));
    }
    public static void Method(double f1) {
    	System.out.println("더블 매서드 : "+(f1*f1));
    }
	public static void main(String[] args) {
		Method();
		Method(100);
		Method(100.5);

	} //매서드 오버로딩. 자기 형식에 맞는 매서드를 호출, 매서드명이 같고 매개변수 형식(갯수 등)이 다른 것 

}
