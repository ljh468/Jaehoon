import java.util.Scanner;

//  ���� �Է¹޾� ��� ����ϱ�
public class Ex48 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		for (int i = 0; i < size; i++) {
			int a = s.nextInt();
			System.out.println(a);
		}
	}
}

/*
 * 0 �Էµ� ������ ���� ����ϱ�1 
	public class Ex48 {
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
 */