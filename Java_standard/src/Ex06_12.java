// ������ �Ű�����
class Car { 
	String color;   // �ν��Ͻ� ���� (iv)
	String gearType;
	int door;
	
	Car(){} // �⺻ ������
	
	Car(String c, String g, int d){ // �Ű������� �ִ� ������
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex06_12 {

	public static void main(String[] args) {
		Car c1 = new Car(); // Car��ü ���� �������� c1�� ����
		c1.color = "white";
		c1.gearType = "auto"; // c1 �ν��Ͻ� ���� �ʱ�ȭ
		c1.door = 4;
		
		Car c2 = new Car("White", "auto", 5); // Car��ü ���� ��������c2�� ����
											  // c2 �ν��Ͻ� �����ʱ�ȭ
											  // �Ű����������ڰ� ������ �����ϰ� �ʱ�ȭ
		
		System.out.println("c1�� color = " + c1.color + ", gearType = " +
		 c1.gearType + ", door =  " + c1.door);

		System.out.println("c2�� color = " + c2.color + ", gearType = " +
		 c2.gearType + ", door =  " + c2.door);
	}
}

