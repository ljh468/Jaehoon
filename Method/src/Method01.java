
public class Method01 {

	public static void main(String[] args) {
		// ������ �ڹ� ������ �� ����Ǵ� ù���� �Լ�(�޼���)
		System.out.println("main�Լ� ȣ�����!!");
		
		int res = sum(1,2);
		System.out.println("sum�Լ� ������ : "+res);
		System.out.println("main�Լ� ȣ�� ��!!");
	}
	
		// main�Լ����� ȣ��Ǵ� �Լ�
	public static int sum(int i1, int i2) {
		System.out.println("sum�Լ� ȣ�����!!");
		
		int sum = 0;
		// �Լ� sum �ȿ����� ����ϴ� ��������
		
		for(int i=i1; i<=i2; i++) {
			sum +=i;
		}
		// ù��° �Է°����� �ι�° �Է°������� ���� ���ϴ� �޼ҵ�
		System.out.println("sum�Լ� ȣ�� ��!!");
		
		return sum;
		// void������ ������ return�� �ʿ�
		// sum�Լ��� integer Ÿ������ �����ؾ��Ѵ�
		
	}

}
