
// �ܾ� ���� ����
import java.util.Scanner;

public class Baekjoon53 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.nextLine().trim();

		if (str.isEmpty()) {
			System.out.println(0);
		} else {
			String[] arr = str.split(" ");

			System.out.println(arr.length);
		}
	}
}