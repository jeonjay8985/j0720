package j0720;

public class exam06 {
	
	    public static void Add(int num1, int num2) {
	    	System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
	    	}
	    public static void Add(int num1, double num2) {   //%f float 대신에 double써도 됨!
	    	System.out.printf("%d+%f=%f\n", num1, num2, num1+num2);
	    	}
	    public static void Add(double num1, int num2) {
	    	System.out.printf("%f+%d=%f\n", num1, num2, num1+num2);
	    	}
	    public static void Add(double num1, double num2) {
	    	System.out.printf("%f+%f=%f\n", num1, num2, num1+num2);
	    	}
	    
	
		public static void main(String[] args) {
			Add(100, 200);
			Add(100, 200.5);
			Add(100.5, 200);
			Add(100.5, 200.5);
		}
          //매서드 오버로딩
}
