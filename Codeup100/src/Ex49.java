import java.util.Scanner;

// 정수 1개 입력받아 카운트다운 출력하기1(설명)
public class Ex49 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(true) {
		
		if (num == 0) {
			break;
		}
		System.out.println(num);
		num--;
		}
	}
}

/*
// 0 입력될 때까지 무한 출력하기2
public class Ex49 {
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