
// 문자열 반복
import java.util.Scanner;

public class Baekjoon51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (int j = 0; j < n; j++) {
			int a = s.nextInt();
			String b = s.next();

			for (int i = 0; i < b.length(); i++) {
				for (int k = 0; k < a; k++) {
					System.out.print(b.charAt(i));
				}

			}
			System.out.println();
		}
	}
}