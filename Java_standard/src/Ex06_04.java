// �޼����� ���� �帧
public class Ex06_04 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); 			// �ν��Ͻ� ������ �ؾ߸� �޼��� ȣ���� �Ҽ��ִ�.
		long result1 = mm.add(5L, 3L);		// add �޼��� ȣ��
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
		// return a + b;  //���� ������ �̿Ͱ��� ���ٷ� ������ �Ҽ��ִ�.
	}
	long subtract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
	long max(long a, long b) {return a>b?a:b;}
	long min(long a, long b) {return a<b?a:b;}
}
