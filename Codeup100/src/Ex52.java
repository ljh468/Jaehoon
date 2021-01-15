import java.util.Scanner;

//[기초-종합] 언제까지 더해야 할까?
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
//원하는 문자가 입력될 때까지 반복 출력하기
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