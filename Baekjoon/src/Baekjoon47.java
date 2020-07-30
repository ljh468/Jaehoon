// �Ѽ� ���ϱ� (1000���� �Ѽ�(���������� �̷�¼�))
import java.util.Scanner;

public class Baekjoon47 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(hansu(num));
	}

	public static int hansu(int num) {
		int count = 0;
		
		if(num <100) { // 100������ ���� ��� ��������
			return num;
		}
		else {
			count = 99; // 100�� 99���� �Ѽ��� ������ ����
			
			for(int i = 100; i<=num; i++) {
				int hundred = i / 100; // 100���ڸ���
				int ten = i / 10 % 10; // 10���ڸ���
				int one = i % 10; // 1���ڸ���
				
				// �Ѽ��� ���ϴ� ���ǹ�(�Ѽ��� count�� +1)
				if((hundred - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}
