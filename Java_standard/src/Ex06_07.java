// ������ �Ű�����
class Data2 { int x; }

public class Ex06_07 {

	public static void main(String[] args) {
		Data2 d = new Data2(); // Data2 �ν��Ͻ� ����
		d.x = 10;			 // Data2 �ν��Ͻ��� �ν��Ͻ����� x�� 10 ����
		System.out.println("main() : x = " + d.x);
		
		change(d);		 // change�޼��忡 d(�ּҰ�)���������� ����   //������d�� ����
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {	// ������ �Ű�����
		d.x = 1000;	// d�� ����Ű�� x������ 1000����
		System.out.println("change() : x = " + d.x);
	}
}

