import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.printf("������� �Է��ϼ��� : ");
		month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���� ������ ���Դϴ�.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("��������� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("��������� �����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("��������� �ܿ��Դϴ�.");

		}

	}
}
