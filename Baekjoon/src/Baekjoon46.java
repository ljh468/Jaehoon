// �����ѹ�
public class Baekjoon46 {
	public static void main(String[] args) {
		//10000���Ͽ��� ã�ƾ� �� 
		int limit = 10000;
		boolean[] temp = new boolean[limit];
		for (int i = 1; i < limit; i++) {
			if (d(i) <= limit) {
				temp[d(i) - 1] = true;
			}
		}
		//�����ѹ��� ���
		for (int j = 0; j < 10000; j++) {
			if (!temp[j]) {
				System.out.println(j + 1);
			}
		}

	}
	// �����ѹ��� ã������ �Լ� (n���� d�� ã��
	public static int d(int n) {
		int d = n;
		while (n > 0) {
			d += n % 10;
			n /= 10;
		}
		return d;
	}
}