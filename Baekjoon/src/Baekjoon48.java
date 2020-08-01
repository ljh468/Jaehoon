// 문자열 아스키코드로 변환
import java.util.Scanner;

public class Baekjoon48 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		int ack = str.charAt(0);
		System.out.println(ack);
	}
}
