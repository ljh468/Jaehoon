// a,b 중 큰값 출력 3항 연산자
import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	
	System.out.println(a > b ? a:b);
	}
}


/*
 비트단위 연산으로 XOR계산 00 0 01 1 11 0 10 1
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a^b);
	}
*/