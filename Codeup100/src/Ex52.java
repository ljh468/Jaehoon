import java.util.Scanner;
// ���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
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
