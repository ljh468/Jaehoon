// ������ �Ű�����
class Data3 { int x; }

public class Ex06_08 {

	public static void main(String[] args) {
		Data3 d = new Data3(); // Data3 �ν��Ͻ� ����
		d.x = 10; 			   // d�� ����Ű�� x�ν��Ͻ������� 10����
		
		Data3 d2 = copy(d);    // �޼��带 static���� �����߱⶧���� ��ü�������� �޼���ȣ�Ⱑ��
							   // copy �޽��忡�� ���� �ν��Ͻ��� �ּҰ��� d2�� ����
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) { // ������ �Ű����� d(�ּҰ�)�� ����
		Data3 tmp = new Data3(); // Data3 �ν��Ͻ�����
		tmp.x = d.x;			 // tmp�� ����Ű�� x �ν��Ͻ������� d.x�� ���� ����	
		return tmp;
	}
	
	
}

