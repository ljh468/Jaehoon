
import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = ~a;  // ��Ʈ������ XOR
		
		System.out.println(b);

	}
}
//�� ���� ��(1) �Ǵ� ����(0)�� �Էµ� ��, ��� ������ ������ ���� ���
/*
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 0 && b == 0) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}

	}
*/