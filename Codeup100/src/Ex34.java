// 정수 3개입력받아 합과 평균
import java.util.Scanner;

public class Ex34{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int b2 = s.nextInt();
		int c3 = s.nextInt();
		
		System.out.println(a1+b2+c3);
		System.out.printf("%.1f",(a1+b2+c3)/(float)3);
	}
}

