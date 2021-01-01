import java.util.Scanner;

//  정수 입력받아 계속 출력하기
public class Ex48 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		for (int i = 0; i < size; i++) {
			int a = s.nextInt();
			System.out.println(a);
		}
	}
}

/*
 * 0 입력될 때까지 무한 출력하기1 
 * public static void main(String[] args) { 
 * Scanner s = new Scanner(System.in);
 * 
 * while(true) { 
 * int num = s.nextInt();https://codeup.kr/d_thread.php?tid=5530&cid=2068
 * if (num == 0) { 
 * 		break; 
 * } 
 * System.out.println(num); }
 */