// 정수 3개입력받아 합과 평균
import java.util.Scanner;

public class Ex34{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println(a+b+c);
		System.out.printf("%.1f",(a+b+c)/(float)3);
	}
}

