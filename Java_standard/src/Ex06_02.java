//��ü�� ������ ���

//�ڹ� �ҽ������� �̸��� ����Ŭ������ �̸��� ���ƾ��Ѵ�.
public class Ex06_02 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// t1���������� ������ Tv��ü�� ���� (Tv ��ü�ּҰ��� t1�� ����)
		Tv t2 = new Tv();	// t2���������� ������ Tv��ü�� ���� (Tv ��ü�ּҰ��� t2�� ����)
		System.out.println("t1�� channel���� " + t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel+"�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		t2 = t1; //t1 �ּҰ��� t2�� ����
				 //t2�� t1�� ����� ��ü�� �����
		
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�.");
	}

}

