import java.util.Scanner;

//[����-����] �������� ���ؾ� �ұ�?
public class Ex52 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			if (sum >= num) {
				System.out.print(i);
				break;
			}
		}
	}
}

/*
//���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
public class Ex52 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			char n = s.next().charAt(0);

			if (n == 'q') {
				System.out.println(n);
				break;
			}

			System.out.println(n);

		}
	}
}
*/