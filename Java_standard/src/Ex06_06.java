// �⺻�� �Ű�����
class Data { int x; }

public class Ex06_06 {

	public static void main(String[] args) {
		Data d = new Data(); // Data �ν��Ͻ� ����
		d.x = 10;			 // Data �ν��Ͻ��� �ν��Ͻ����� x�� 10 ����
		System.out.println("main() : x = " + d.x);
		
		change(d.x);		 // change�޼��忡 d.x�� ���� �μ��� ����
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); 
	}
								//�⺻�� �Ű�����
	static void change(int x) {	// change �޼��� ����
		x = 1000;	// �������� x�� 1000����
		System.out.println("change() : x = " + x);
	}
}

