import java.util.Scanner;

// 0 �Էµ� ������ ���� ����ϱ�2
public class Ex49 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int num = s.nextInt();
			if (num == 0) {
				break;
			}
			System.out.println(num);
		}
	}
}
