import java.util.Arrays;

public class Ex05_03 {

	public static void main(String[] args) {
		// �迭�� �ּҰ�, �ִ밪���ϱ�
		int[] num = new int[10];// �迭�� ����
		

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1; // 1~100���� �����Ǽ� �迭�� ����
		}
		System.out.println(Arrays.toString(num));
		
		int max = num[0]; //�ִ밪 �ʱ�ȭ
		int min = num[0]; //�ּҰ� �ʱ�ȭ
		
		for(int i =1; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			else if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("�ִ밪�� ==>"+max);
		System.out.println("�ּҰ��� ==>"+min);
	}
}