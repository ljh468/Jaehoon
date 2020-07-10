// 오버로딩
public class Ex06_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
												 // 먼저호출
		System.out.println("mm.add(3, 3) 결과: " + mm.add(3,3)); 
		System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L,3)); 
		System.out.println("mm.add(3, 3L) 결과: " + mm.add(3,3L)); 
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L)); 
		
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}

class MyMath3 {
	// 1.메서드이름은 같아야함, 2.매개변수의 개수 또는 타입이 달라야함, 3.반환타입은 영향없다
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}	
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a+b;		
	}
	long add(long a, long b) {
		System.out.print("int add(long a, long b) - ");
		return a+b;
	}
	// 배열을 매개변수로 받음
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
