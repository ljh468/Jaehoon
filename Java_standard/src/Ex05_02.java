import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		// �迭�� ����, ��� ���ϱ�
		int sum = 0;
		float average = 0f;
		int[] num = {100, 88, 100, 100, 90}; // �迭���� 5
		
		for(int i = 0; i < num.length; i++) { // �迭 �ε����� 0,1,2,3,4
		sum += num[i];
		}
		average = sum/(float)num.length;
		System.out.println(Arrays.toString(num));
		System.out.println("������==> "+sum);
		System.out.println("�����==> "+average);
		
	}

}
