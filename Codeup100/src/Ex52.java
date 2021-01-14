import java.util.Scanner;
// 원하는 문자가 입력될 때까지 반복 출력하기
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
