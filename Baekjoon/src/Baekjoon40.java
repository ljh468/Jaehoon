// 숫자의 개수 <배열의 값을 %10 나머지값을 이용하여 ++; 갯수 출력
import java.util.Scanner;

	public class Baekjoon40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int gup = a * b * c;
		int[] arr = new int[10];
		while (gup != 0) {
			arr[gup % 10]++;
			gup /= 10;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
/*
public class Baekjoon40 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();

		int[] arr = new int[10];
		String gup = String.valueOf(a * b * c);
		for (int i = 0; i < gup.length(); i++) {
			arr[gup.charAt(i)-'0']++;
		}
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
}
*/