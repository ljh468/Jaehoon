// static메서드와 인스턴스메서드
class MyMath2 {
	long a, b; // 인스턴스변수(iv) 정의
	
	// iv(인스턴스변수) a, b만을 이용해서 작업하므로 매개변수가 필요없다. //iv 사용
	// 인스턴스 메서드
	long add()	{return a+b;}
	long subtract()	{return a-b;}
	long multiply()	{return a*b;}
	double divide()	{return a/b;}
	
	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다. // iv 사용안함
	// static 메서드(클래스 메서드)
	static long add(long a, long b)	{return a + b;} // a, b는 지역변수
	static long subtract(long a, long b)	{return a - b;} // a, b는 지역변수
	static long multiply(long a, long b)	{return a * b;} // a, b는 지역변수
	static double divide(double a, double b)	{return a / b;} // a, b는 지역변수
}

public class Ex06_09 {

	public static void main(String[] args) {
	// 클래스메서드 호출. 인스턴스 생성없이 호출가능	// iv 사용안함
	// 
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();	// 인스턴스 생성
		mm.a = 200L;				// 인스턴스변수(iv) 값저장
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능  // iv로 작업
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
