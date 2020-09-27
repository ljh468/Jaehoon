
import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = ~a;  // 비트연산자 XOR
		
		System.out.println(b);

	}
}
//두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때에만 참이 계산
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