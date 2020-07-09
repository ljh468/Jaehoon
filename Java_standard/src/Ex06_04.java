// 메서드의 실행 흐름
public class Ex06_04 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); 			// 인스턴스 생성을 해야만 메서드 호출을 할수있다.
		long result1 = mm.add(5L, 3L);		// add 메서드 호출
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		long result6 = mm.min(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+ result1);
		System.out.println("subtract(5L, 3L) = "+ result2);
		System.out.println("multiply(5L, 3L) = "+ result3);
		System.out.println("divide(5L, 3L) = "+ result4);
		System.out.println("max(5L, 3L) = "+ result5);
		System.out.println("min(5L, 3L) = "+ result6);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b;  //위의 두줄을 이와같이 한줄로 간단히 할수있다.
	}
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
	long max(long a, long b) {return a>b?a:b;}
	long min(long a, long b) {return a<b?a:b;}
}
