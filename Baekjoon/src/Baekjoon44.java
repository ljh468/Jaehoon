import java.util.Scanner;

public class Baekjoon44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // ���̽���
		int n = 0; // �л���
		double avg = 0; // �������
		int[] arr = new int[1000];
		
		
		// ���̽� �� Ȯ��
		for (int i = 0; i < c; i++) {
			n = s.nextInt();
			int sum = 0; // �հ� �ѹ� �������� �ʱ�ȭ
			int num = 0; // ��ճѴ� �л��� �ѹ� �������� �ʱ�ȭ

			for (int j = 0; j < n; j++) { // �Է� �ݺ���
				arr[j] = s.nextInt();
				sum += arr[j]; // �հ豸�ϱ�
			}
			avg = (double)sum / n; // ��ձ��ϱ�

			for (int j = 0; j < n; j++) { // �л��� ����
				if (arr[j] > avg) {
					num++;
				}
			}
			System.out.printf("%.3f%%\n", 100.0 * num / n);
			
		}
		s.close();
	}
}